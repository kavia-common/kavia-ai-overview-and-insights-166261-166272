package com.example.backend.dto;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * PUBLIC_INTERFACE
 * DTO representing a Frequently Asked Question entry.
 */
@Schema(description = "FAQ entry containing a question and its answer")
public class FaqEntry {

    @Schema(description = "The frequently asked question", example = "What is Kavia AI?")
    private String question;

    @Schema(description = "The answer to the question", example = "Kavia AI is an AI-powered development assistant...")
    private String answer;

    public FaqEntry() {}

    public FaqEntry(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
