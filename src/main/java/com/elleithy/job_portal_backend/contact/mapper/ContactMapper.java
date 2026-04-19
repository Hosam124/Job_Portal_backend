package com.elleithy.job_portal_backend.contact.mapper;

import com.elleithy.job_portal_backend.contact.dto.ContactRequestDto;
import com.elleithy.job_portal_backend.contact.entity.Contact;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
public class ContactMapper {
    public Contact toEntity(ContactRequestDto dto) {
        Contact contact = new Contact();
        BeanUtils.copyProperties(dto, contact);
        contact.setStatus("NEW");
        contact.setCreatedAt(Instant.now());
        contact.setCreatedBy("System");
        contact.setStatus("NEW");
        return contact;
    }

    public ContactRequestDto toDto(Contact contact) {
        return new ContactRequestDto(
                contact.getEmail(),
                contact.getMessage(),
                contact.getName(),
                contact.getSubject(),
                contact.getUserType()
        );
    }
}
