// 관련 패키지 import
// -----------------
require("dotenv").config();
const express = require("express");
const expressLayouts = require("express-ejs-layouts");
const connectDb = require("./config/db");
const cookieParser = require("cookie-parser");
const methodOverride = require("method-override");

// express 웹서버 설정
// ------------------
const app = express();
const port = process.env.PORT || 3000;

// Mongo Db 접속
// -------------
connectDb();

// ejs 설정
// --------
app.use(expressLayouts);
app.set("view engine", "ejs");
app.set("views", "./views");

// 정적 파일 설정
// -------------
app.use(express.static("public"));


// 미들웨어 설정
// ------------
app.use(express.json());
app.use(express.urlencoded( { extended: true }));

// app.use(cookieParser);

app.use(methodOverride("_method"));

// router 설정
// -----------
app.use("/", require("./routes/main"));
app.use("/", require("./routes/admin"));

// 웹서버 기동
// ----------
app.listen(port, () => {
    console.log(`App listening on port ${port}`);
});