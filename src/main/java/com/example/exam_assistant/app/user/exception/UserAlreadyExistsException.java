package com.example.exam_assistant.app.user.exception;

import com.example.exam_assistant.app.exception.GeneralException;

public class UserAlreadyExistsException extends GeneralException {

    public UserAlreadyExistsException() {
        super("User with given email already exists.");
    }
}
