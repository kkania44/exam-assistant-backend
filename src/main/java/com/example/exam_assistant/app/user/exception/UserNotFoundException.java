package com.example.exam_assistant.app.user.exception;

import com.example.exam_assistant.app.exception.GeneralException;

public class UserNotFoundException extends GeneralException {
    public UserNotFoundException() {
        super("User not found.");
    }
}
