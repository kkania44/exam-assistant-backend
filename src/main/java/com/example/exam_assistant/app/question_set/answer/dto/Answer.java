package com.example.exam_assistant.app.question_set.answer.dto;

import com.example.exam_assistant.app.question_set.answer.repository.AnswerEntity;

public record Answer(long id, String content, boolean correct) {

    public static Answer fromEntity(AnswerEntity entity) {
        return new Answer(entity.getId(), entity.getContent(), entity.isCorrect());
    }

}
