package com.example.backend.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.context.annotation.Configuration;

/**
 * OpenAPI configuration for the backend application.
 */
@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Kavia AI Info Backend",
                version = "0.1.0",
                description = "REST API providing informational pages, FAQs, and contact form for Kavia AI.",
                contact = @Contact(name = "Kavia AI", url = "https://kaviaplatform.com", email = "support@kaviaplatform.com")
        ),
        tags = {
                @Tag(name = "Info", description = "Endpoints providing general information about Kavia AI"),
                @Tag(name = "FAQs", description = "Endpoints for retrieving Frequently Asked Questions"),
                @Tag(name = "Contact", description = "Endpoints for contact form submissions")
        }
)
public class OpenApiConfig {
    // No runtime logic required; annotations drive the OpenAPI metadata.
}
