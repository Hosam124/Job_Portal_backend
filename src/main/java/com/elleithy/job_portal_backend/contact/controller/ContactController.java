package com.elleithy.job_portal_backend.contact.controller;

import com.elleithy.job_portal_backend.contact.dto.ContactRequestDto;
import com.elleithy.job_portal_backend.contact.entity.Contact;
import com.elleithy.job_portal_backend.contact.mapper.ContactMapper;
import com.elleithy.job_portal_backend.contact.service.IContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contacts")
@RequiredArgsConstructor
public class ContactController {

    private final IContactService contactService;
    private final ContactMapper contactMapper;

    @PostMapping(version = "1.0")
    ResponseEntity<String> createContact(@RequestBody ContactRequestDto contactRequestDto) {
        Contact newContact = contactMapper.toEntity(contactRequestDto);
        boolean isSaved = contactService.isContactSaved(newContact);
        if (isSaved) {
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body("Request processed successfully");
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Request processed failed");
        }
    }
}
