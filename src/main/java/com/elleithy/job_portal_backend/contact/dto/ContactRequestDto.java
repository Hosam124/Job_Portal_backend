package com.elleithy.job_portal_backend.contact.dto;

import java.io.Serializable;

/**
 * DTO for {@link com.elleithy.job_portal_backend.contact.entity.Contact}
 */
public record ContactRequestDto(String email, String message, String name, String subject,
                                String userType) implements Serializable {
}