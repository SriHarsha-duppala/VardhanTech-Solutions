package com.example.vardhantech.controller;

import com.example.vardhantech.model.Contact;
import com.example.vardhantech.service.ContactService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "*")
public class ContactController {

    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    // SAVE CONTACT MESSAGE
    @PostMapping
    public ResponseEntity<String> saveContact(@RequestBody Contact contact) {
        contactService.saveContact(contact);
        return ResponseEntity.ok("Message saved successfully");
    }

    // TEST API
    @GetMapping("/test")
    public String test() {
        return "VardhanTech Backend Running Successfully";
    }
}
