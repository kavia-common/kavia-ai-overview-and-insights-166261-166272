package com.example.backend.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;

/**
 * PUBLIC_INTERFACE
 * DTO representing general information about Kavia AI.
 */
@Schema(description = "General information response about Kavia AI")
public class InfoResponse {

    @Schema(description = "Title of the information section", example = "About Kavia AI")
    private String title;

    @Schema(description = "Description of Kavia AI", example = "Kavia AI is an intelligent code assistant...")
    private String description;

    @Schema(description = "Key features of Kavia AI", example = "[\"Code generation\",\"Automated testing\",\"Documentation\"]")
    private List<String> features;

    @Schema(description = "Common use cases for Kavia AI", example = "[\"Rapid prototyping\",\"Legacy modernization\"]")
    private List<String> useCases;

    public InfoResponse() {}

    public InfoResponse(String title, String description, List<String> features, List<String> useCases) {
        this.title = title;
        this.description = description;
        this.features = features;
        this.useCases = useCases;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getFeatures() {
        return features;
    }

    public List<String> getUseCases() {
        return useCases;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFeatures(List<String> features) {
        this.features = features;
    }

    public void setUseCases(List<String> useCases) {
        this.useCases = useCases;
    }
}
