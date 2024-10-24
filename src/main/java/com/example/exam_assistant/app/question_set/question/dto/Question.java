package com.example.exam_assistant.app.question_set.question.dto;

import com.example.exam_assistant.app.question_set.answer.dto.Answer;
import com.example.exam_assistant.app.question_set.question.repository.QuestionEntity;

import java.util.Set;

import static java.util.stream.Collectors.toSet;

public record Question(long id, String content, int correctAnswers, Set<Answer> answers) {

    public static Question fromEntity(QuestionEntity entity) {
        return new Question(
                entity.getId(),
                entity.getContent(),
                entity.getNumberOfCorrectAnswers(),
                entity.getAnswers().stream()
                        .map(Answer::fromEntity)
                        .collect(toSet())
        );
    }
}
