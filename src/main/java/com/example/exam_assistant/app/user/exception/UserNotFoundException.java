package com.example.exam_assistant.app.user.exception;

import com.example.exam_assistant.app.exception.GeneralException;

import static com.example.exam_assistant.app.exception.ExceptionMessage.USER_NOT_FOUND;

public class UserNotFoundException extends GeneralException {
    public UserNotFoundException() {
        super(USER_NOT_FOUND);
    }
}
