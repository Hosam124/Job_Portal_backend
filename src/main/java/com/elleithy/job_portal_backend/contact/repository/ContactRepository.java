package com.elleithy.job_portal_backend.contact.repository;

import com.elleithy.job_portal_backend.contact.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}