package com.example.exam_assistant.app.exception;

import java.io.Serializable;
import java.time.LocalDateTime;

import static java.time.LocalDateTime.now;

public class ExceptionBody implements Serializable {

    private final ExceptionMessage message;
    private final LocalDateTime timestamp;
    private Object details;

    public ExceptionBody(ExceptionMessage message) {
        this.message = message;
        this.timestamp = now();
    }

    public ExceptionBody(ExceptionMessage message, Object details) {
        this.message = message;
        this.details = details;
        this.timestamp = now();
    }
}
