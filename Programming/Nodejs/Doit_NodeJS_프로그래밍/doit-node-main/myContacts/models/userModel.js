const mongoose = require("mongoose");

const UserSchema = new mongoose.Schema( {
    username: {
        type: String,
        rquired: true,
        unique: true,
    },
    password: {
        type: String,
        required: true,
    },
});

// 스키마 -> 모델
// mongoose.model(모델명, 스키마명);
module.exports = mongoose.model("User", UserSchema);