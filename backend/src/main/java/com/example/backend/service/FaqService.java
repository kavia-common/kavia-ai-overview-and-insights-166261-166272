package com.example.backend.service;

import com.example.backend.dto.FaqEntry;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service returning FAQ entries for Kavia AI.
 */
@Service
public class FaqService {

    /**
     * PUBLIC_INTERFACE
     * Provides a list of frequently asked questions and answers about Kavia AI.
     *
     * @return list of FaqEntry objects
     */
    public List<FaqEntry> getFaqs() {
        return List.of(
                new FaqEntry(
                        "What is Kavia AI?",
                        "Kavia AI is an AI-powered assistant that helps teams design, implement, and document software faster."
                ),
                new FaqEntry(
                        "How does Kavia AI improve productivity?",
                        "It automates repetitive tasks like scaffolding code, writing tests, and generating documentation while following best practices."
                ),
                new FaqEntry(
                        "Does Kavia AI support CI integrations?",
                        "Yes, it produces code that works with typical CI flows and can adapt to environment constraints."
                ),
                new FaqEntry(
                        "Is data persisted in this demo?",
                        "For the demo, data is served in-memory. Contact submissions return a tracking ID but are not persisted."
                )
        );
    }
}
