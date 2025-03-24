package com.example.blogapp.service;

import com.theokanning.openai.service.OpenAiService;
import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.completion.CompletionResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class OpenAiBlogService {

    private final OpenAiService openAiClient;

    public OpenAiBlogService(@Value("${openai.api.key}") String apiKey) {
        this.openAiClient = new OpenAiService(apiKey);
    }

    public String summarizeBlog(String blogContent) {
        try {
            CompletionRequest request = CompletionRequest.builder()
                    .model("gpt-3.5-turbo")
                    .prompt("Summarize this blog:\n" + blogContent)
                    .maxTokens(100)
                    .temperature(0.7)
                    .build();

            CompletionResult result = openAiClient.createCompletion(request);

            return result.getChoices().isEmpty() ? "Failed to generate summary"
                    : result.getChoices().getFirst().getText().trim();
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}