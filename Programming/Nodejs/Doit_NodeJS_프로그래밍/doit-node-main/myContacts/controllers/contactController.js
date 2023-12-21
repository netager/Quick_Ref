const asyncHandler = require("express-async-handler");
const Contact = require("../models/contactModel");

// Get all contacts
// GET /contacts
const getAllContacts = asyncHandler(async (req, res) => {
    const contacts = await Contact.find();
    res.send(contacts);
});


// Create contact
// POST /contacts
const createContacts = asyncHandler(async (req, res) => {
    console.log(req.body);
    const {name, email, phone} = req.body;  // 구조분해 할당
    if (!name || !email || !phone) {
        return res.status(400).send("필수 값이 입력되지 않았습니다.");
    }
    const contact = await Contact.create( {
        name, email, phone
    });
    res.status(201).send("Create Contacts");
});


// @desc Get contact
// @route GET /contacts/:id
const getContact = asyncHandler(async (req, res) => {
    // 연락처 상세 보기
    const contact = await Contact.findById(req.params.id);
    res.status(200).send(contact);
});

// @desc Put contact
// @route PUT /contacts/:id
const updateContact = asyncHandler(async (req, res) => {
    // 연락처 수정 하기
    const id = req.params.id;
    const { name, email, phone } = req.body;
    const contact = await Contact.findById(id);
    if(!contact) {
        throw new Error("Contact not found");
    }

    contact.name = name;
    contact.email = email;
    contact.phone = phone;

    contact.save(); // DB에 저장

    res.json(contact);
});

// @desc Delete contact
// @route DELETE /contacts/:id
const deleteContact = asyncHandler(async (req, res) => {
    // 연락처 삭제하기
    const id = req.params.id;

    const contact = await Contact.findById(id);
    if(!contact) {
        throw new Error("Contact not found");
    }

    await Contact.deleteOne(contact);
    res.status(200).send(`Deleted Contact for ID : ${req.params.id}`);
});

module.exports = { 
    getAllContacts, 
    createContacts, 
    getContact, 
    updateContact, 
    deleteContact 
};