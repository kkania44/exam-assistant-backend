package com.example.exam_assistant.app.question_set.dto;

import com.example.exam_assistant.app.question_set.repository.QuestionSetEntity;

public record QuestionSet(long id, String name, String description, long authorId) {

    public static QuestionSet fromEntity(QuestionSetEntity entity) {
        return new QuestionSet(
                entity.getId(),
                entity.getName(),
                entity.getDescription(),
                entity.getUser().getId()
        );
    }
}
