const express = require("express");
const router = express.Router();
const mainLayout = "../views/layouts/main.ejs";
const Post = require("../models/Post");
const asyncHandler = require("express-async-handler");



// router.get("/", (req, res) => {
//     res.send("Hello World!");
// });

router.get(["/", "/home"], asyncHandler( async (req, res) => {
    const locals = {
        title: "Home"
    };
    const data = await Post.find();
    res.render("index", { locals: locals, data, layout: mainLayout});
}));

router.get("/about", (req, res) => {
    const locals = {
        title: "About"
    }
    res.render("about", { locals: locals, layout: mainLayout});
});

/**
 * 게시물 상세 보기
 * GET /post/:id
 */
router.get("/post/:id", asyncHandler( async (req, res) => {
    const data = await Post.findOne({ _id: req.params.id});
    res.render("post", {data, layout: mainLayout});
}));

module.exports = router;

// 임시 데이터 저장
// Post.insertMany( [
//     {
//         title: "제목 1",
//         body: "내용 1 - λ nodemon app [nodemon] restarting due to changes... [nodemon] restarting due to changes... \
//         [nodemon] starting `node app.js` \
//         App listening on port 3000 \
//         DB Connected: ac-n6bgr9m-shard-00-02.bcp0ryy.mongodb.net"
//     },
//     {
//         title: "제목 2",
//         body: "내용 2 - λ nodemon app [nodemon] restarting due to changes... [nodemon] restarting due to changes... \
//         [nodemon] starting `node app.js` \
//         App listening on port 3000 \
//         DB Connected: ac-n6bgr9m-shard-00-02.bcp0ryy.mongodb.net"
//     },
//     {
//         title: "제목 3",
//         body: "내용 3 - λ nodemon app [nodemon] restarting due to changes... [nodemon] restarting due to changes... \
//         [nodemon] starting `node app.js` \
//         App listening on port 3000 \
//         DB Connected: ac-n6bgr9m-shard-00-02.bcp0ryy.mongodb.net"
//     },
//     {
//         title: "제목 4",
//         body: "내용 4 - λ nodemon app [nodemon] restarting due to changes... [nodemon] restarting due to changes... \
//         [nodemon] starting `node app.js` \
//         App listening on port 3000 \
//         DB Connected: ac-n6bgr9m-shard-00-02.bcp0ryy.mongodb.net"
//     },
//     {
//         title: "제목 5",
//         body: "내용 5 - λ nodemon app [nodemon] restarting due to changes... [nodemon] restarting due to changes... \
//         [nodemon] starting `node app.js` \
//         App listening on port 3000 \
//         DB Connected: ac-n6bgr9m-shard-00-02.bcp0ryy.mongodb.net"
//     },

// ]);