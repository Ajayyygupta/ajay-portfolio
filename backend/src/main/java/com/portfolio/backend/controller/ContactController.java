package com.portfolio.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.backend.model.Contact;
import com.portfolio.backend.service.ContactService;


@RestController
@CrossOrigin(origins ="*")
@RequestMapping
public class ContactController {


    @Autowired
    private ContactService contactService;

    @PostMapping("/contact")
    public Contact savecontact(@RequestBody Contact contact)
    {
        return  contactService.save(contact);
    }



}
