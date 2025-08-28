package com.example.backend.dto;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * PUBLIC_INTERFACE
 * DTO representing a confirmation response for contact form submissions.
 */
@Schema(description = "Response returned after processing a contact request")
public class ContactResponse {

    @Schema(description = "Status message", example = "Thank you Alex Doe, your message has been received.")
    private String message;

    @Schema(description = "Server-side identifier for tracking", example = "REQ-20250101-123456")
    private String requestId;

    public ContactResponse() {}

    public ContactResponse(String message, String requestId) {
        this.message = message;
        this.requestId = requestId;
    }

    public String getMessage() {
        return message;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}
