const express = require("express");
const router = express.Router();
const { 
    getAllContacts, 
    createContacts,
    getContact,
    updateContact,
    deleteContact,
    addContactForm,
 } = require("../controllers/contactController");

// /contacts에 대한 라우터 미들웨어 사용
router.route("/").get(getAllContacts);

router.route("/add").get(addContactForm).post(createContacts);

// /contacts/:id 에 대한 라우터 미들웨어 사용
router.route("/:id")
 .get(getContact)
 .put(updateContact)
 .delete(deleteContact);

 module.exports = router;