package com.example.vardhantech.service.impl;

import com.example.vardhantech.model.Contact;
import com.example.vardhantech.repository.ContactRepository;
import com.example.vardhantech.service.ContactService;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService {

    private final ContactRepository contactRepository;

    public ContactServiceImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public void saveContact(Contact contact) {
        contactRepository.save(contact);
    }
}
