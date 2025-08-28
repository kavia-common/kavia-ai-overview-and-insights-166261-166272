package com.example.backend.service;

import com.example.backend.dto.InfoResponse;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service providing general Kavia AI information.
 */
@Service
public class InfoService {

    /**
     * PUBLIC_INTERFACE
     * Returns a static info response for Kavia AI.
     *
     * @return InfoResponse populated with description, features, and use cases
     */
    public InfoResponse getInfo() {
        return new InfoResponse(
                "About Kavia AI",
                "Kavia AI is an AI-powered engineering assistant that accelerates software delivery by generating high-quality code, tests, and documentation with strong guardrails and best practices.",
                List.of(
                        "Code generation and refactoring",
                        "Automated test creation and execution",
                        "Architecture-aware documentation",
                        "Multi-agent workflows with tool usage"
                ),
                List.of(
                        "Rapid prototyping and MVPs",
                        "Legacy code modernization",
                        "Test coverage improvement",
                        "Developer productivity enablement"
                )
        );
    }
}
