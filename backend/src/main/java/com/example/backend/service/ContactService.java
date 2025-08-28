package com.example.backend.service;

import com.example.backend.dto.ContactRequest;
import com.example.backend.dto.ContactResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Service handling contact form submissions.
 */
@Service
public class ContactService {

    private static final Logger log = LoggerFactory.getLogger(ContactService.class);

    /**
     * PUBLIC_INTERFACE
     * Handles a contact request by generating a request identifier and logging the submission.
     * In a real implementation, this could send emails, store data in a DB, or create tickets.
     *
     * @param request the contact request
     * @return ContactResponse containing a confirmation message and request ID
     */
    public ContactResponse handleContact(ContactRequest request) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss"));
        String requestId = "REQ-" + timestamp + "-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();

        // Log the contact submission for auditing (no persistence in this demo)
        log.info("Contact submission [{}]: name='{}', email='{}', subject='{}', message='{}'",
                requestId, request.getName(), request.getEmail(), request.getSubject(), sanitizeMessage(request.getMessage()));

        String message = "Thank you " + request.getName() + ", your message has been received.";
        return new ContactResponse(message, requestId);
    }

    // Basic sanitization for logs
    private String sanitizeMessage(String msg) {
        if (msg == null) return "";
        return msg.replaceAll("[\\r\\n\\t]", " ").trim();
    }
}
