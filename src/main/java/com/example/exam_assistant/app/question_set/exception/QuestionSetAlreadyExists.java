package com.example.exam_assistant.app.question_set.exception;

import com.example.exam_assistant.app.exception.GeneralException;

import static com.example.exam_assistant.app.exception.ExceptionMessage.QUESTION_SET_ALREADY_EXISTS;

public class QuestionSetAlreadyExists extends GeneralException {

    public QuestionSetAlreadyExists() {
        super(QUESTION_SET_ALREADY_EXISTS);
    }

}
