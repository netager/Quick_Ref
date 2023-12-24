const express = require("express");
const dbConnect = require("./config/dbConnect");
const methodOverride = require("method-override");
const app = express();

app.set("view engine", "ejs");
app.set("views", "./views");

app.use(express.static("./public"));

app.use(methodOverride("_method"));

dbConnect();

// app.get("/", (req, res) => {
//     res.send("Hello, Node!")
// });

// Body Parser 등록 - 바디파서 미들웨어
// ----------------------------------
app.use(express.json());
app.use(express.urlencoded({extended: true}));


// 외부의 router 미들웨어 연계
// -------------------------
// app.use("/users", require("./routes/contactRoutes"));
app.use("/", require("./routes/loginRoutes"));
app.use("/contacts", require("./routes/contactRoutes"));


app.listen(3000, () => {
    console.log('서버 실행 중');

});