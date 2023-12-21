const mongoose = require("mongoose");
require("dotenv").config();

// async, await
const dbConnect = async () => {
    try {
        console.log("DB COnnecting .....");
        const connect = await mongoose.connect(process.env.DB_CONNECT);
        console.log("DB Connected");
    } catch(err) {
        console.log(err);
    }
}

module.exports = dbConnect;