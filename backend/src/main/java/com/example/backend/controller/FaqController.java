package com.example.backend.controller;

import com.example.backend.dto.FaqEntry;
import com.example.backend.service.FaqService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * PUBLIC_INTERFACE
 * Controller exposing frequently asked questions for Kavia AI.
 */
@RestController
@Tag(name = "FAQs", description = "Endpoints for retrieving Frequently Asked Questions")
public class FaqController {

    private final FaqService faqService;

    public FaqController(FaqService faqService) {
        this.faqService = faqService;
    }

    /**
     * PUBLIC_INTERFACE
     * Returns a list of frequently asked questions and answers.
     *
     * @return list of FaqEntry objects representing question-answer pairs
     */
    @GetMapping(path = "/api/faqs", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(
            summary = "Get FAQs",
            description = "Returns the list of frequently asked questions about Kavia AI.",
            responses = {
                    @ApiResponse(responseCode = "200", description = "FAQs retrieved successfully",
                            content = @Content(mediaType = "application/json",
                                    array = @ArraySchema(schema = @io.swagger.v3.oas.annotations.media.Schema(implementation = FaqEntry.class))))
            }
    )
    public List<FaqEntry> getFaqs() {
        return faqService.getFaqs();
    }
}
