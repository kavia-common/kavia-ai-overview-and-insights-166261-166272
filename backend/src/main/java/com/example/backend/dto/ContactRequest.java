package com.example.backend.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

/**
 * PUBLIC_INTERFACE
 * DTO representing a contact form submission.
 */
@Schema(description = "Contact form request payload")
public class ContactRequest {

    @NotBlank
    @Size(max = 100)
    @Schema(description = "Name of the person contacting", example = "Alex Doe")
    private String name;

    @NotBlank
    @Email
    @Schema(description = "Email address of the person contacting", example = "alex@example.com")
    private String email;

    @NotBlank
    @Size(max = 150)
    @Schema(description = "Subject of the message", example = "Inquiry about Kavia AI features")
    private String subject;

    @NotBlank
    @Size(max = 2000)
    @Schema(description = "The message content", example = "Hello, I would like to know more about ...")
    private String message;

    public ContactRequest() {}

    public ContactRequest(String name, String email, String subject, String message) {
        this.name = name;
        this.email = email;
        this.subject = subject;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getSubject() {
        return subject;
    }

    public String getMessage() {
        return message;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
