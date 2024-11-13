package com.example.exam_assistant.app.exception;

import lombok.Getter;

@Getter
public class GeneralException extends RuntimeException {

    private final ExceptionBody body;

    public GeneralException(ExceptionMessage message) {
        super(message.toString());
        this.body = new ExceptionBody(message);
    }

}
