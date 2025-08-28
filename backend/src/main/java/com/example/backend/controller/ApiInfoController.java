package com.example.backend.controller;

import com.example.backend.dto.InfoResponse;
import com.example.backend.service.InfoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * PUBLIC_INTERFACE
 * Controller exposing informational API about Kavia AI.
 */
@RestController
@Tag(name = "Info", description = "Endpoints providing general information about Kavia AI")
public class ApiInfoController {

    private final InfoService infoService;

    public ApiInfoController(InfoService infoService) {
        this.infoService = infoService;
    }

    /**
     * PUBLIC_INTERFACE
     * Returns general information about Kavia AI including description, features, and use cases.
     *
     * @return InfoResponse containing title, description, features, and use cases
     */
    @GetMapping(path = "/api/info", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(
            summary = "Get Kavia AI information",
            description = "Returns general information about Kavia AI including description, features, and use cases.",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Information retrieved successfully",
                            content = @Content(mediaType = "application/json"))
            }
    )
    public InfoResponse getInfo() {
        return infoService.getInfo();
    }
}
