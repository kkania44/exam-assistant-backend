package com.example.exam_assistant.app.user.exception;

import com.example.exam_assistant.app.exception.GeneralException;

import static com.example.exam_assistant.app.exception.ExceptionMessage.USER_ALREADY_EXISTS;

public class UserAlreadyExistsException extends GeneralException {

    public UserAlreadyExistsException() {
        super(USER_ALREADY_EXISTS);
    }
}
