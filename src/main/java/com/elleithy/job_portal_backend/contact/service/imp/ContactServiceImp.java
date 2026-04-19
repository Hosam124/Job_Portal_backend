package com.elleithy.job_portal_backend.contact.service.imp;

import com.elleithy.job_portal_backend.contact.entity.Contact;
import com.elleithy.job_portal_backend.contact.repository.ContactRepository;
import com.elleithy.job_portal_backend.contact.service.IContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ContactServiceImp implements IContactService {

    private final ContactRepository contactRepository;

    @Override
    public boolean isContactSaved(Contact contact) {
        boolean result = false;
        Contact addedContact = contactRepository.save(contact);
        if (addedContact != null && addedContact.getId() != null) {
            return true;
        }
        return result;
    }
}
