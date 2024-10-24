package com.example.exam_assistant.app.question_set.service;

import com.example.exam_assistant.app.question_set.dto.CreateQuestionSetDto;
import com.example.exam_assistant.app.question_set.dto.QuestionSet;
import com.example.exam_assistant.app.question_set.question.dto.Question;

import java.util.List;

public interface QuestionSetService {

    List<Question> getByQuestionSetId(long id);

    QuestionSet create(CreateQuestionSetDto questionSet);
}
