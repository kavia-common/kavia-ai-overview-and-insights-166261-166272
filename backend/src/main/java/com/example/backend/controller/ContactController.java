package com.example.backend.controller;

import com.example.backend.dto.ContactRequest;
import com.example.backend.dto.ContactResponse;
import com.example.backend.service.ContactService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.validation.Valid;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * PUBLIC_INTERFACE
 * Controller handling contact form submissions.
 */
@RestController
@Tag(name = "Contact", description = "Endpoints for contact form submissions")
public class ContactController {

    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    /**
     * PUBLIC_INTERFACE
     * Accepts a contact request and returns a confirmation response.
     *
     * @param request ContactRequest containing name, email, subject, and message
     * @return ContactResponse with a status message and an identifier
     */
    @PostMapping(path = "/api/contact", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(
            summary = "Submit contact request",
            description = "Accepts a contact form submission for Kavia AI inquiries.",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Contact request processed successfully",
                            content = @Content(mediaType = "application/json")),
                    @ApiResponse(responseCode = "400", description = "Invalid request payload",
                            content = @Content(mediaType = "application/json"))
            }
    )
    public ContactResponse submitContact(@RequestBody @Valid ContactRequest request) {
        return contactService.handleContact(request);
    }
}
