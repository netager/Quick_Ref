const express = require("express");
const router = express.Router();
const { 
    getLogin, loginUser, getRegister, registerUser,
 } = require("../controllers/loginController");

// /contacts에 대한 라우터 미들웨어 사용
router.route("/").get(getLogin).post(loginUser);
router.route("/register").get(getRegister).post(registerUser);

 module.exports = router;