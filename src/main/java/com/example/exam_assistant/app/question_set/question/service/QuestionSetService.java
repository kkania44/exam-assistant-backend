package com.example.exam_assistant.app.question_set.question.service;

import com.example.exam_assistant.app.question_set.question.dto.Question;

import java.util.List;

public interface QuestionSetService {

    List<Question> getByQuestionSetId(long id);
}
