package com.example.exam_assistant.app.exception;

import lombok.Getter;

@Getter
public class GeneralException extends RuntimeException {

    private final ExceptionBody body;

    public GeneralException(String message) {
        super(message);
        this.body = new ExceptionBody(message);
    }

}
