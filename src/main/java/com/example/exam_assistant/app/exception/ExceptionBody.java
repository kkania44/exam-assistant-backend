package com.example.exam_assistant.app.exception;

import java.time.LocalDateTime;

import static java.time.LocalDateTime.now;

public class ExceptionBody {
    String message;
    LocalDateTime timestamp;

    public ExceptionBody(String message) {
        this.message = message;
        this.timestamp = now();
    }
}
