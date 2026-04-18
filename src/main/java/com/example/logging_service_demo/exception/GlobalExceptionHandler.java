package com.example.logging_service_demo.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.logging_service_demo.service.LlmService;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @Autowired
    private LlmService llmService;

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handle(Exception ex) {

        llmService.analyzeError(ex.getMessage());

        return ResponseEntity.status(500).body("Error sent to LLM");
    }
}