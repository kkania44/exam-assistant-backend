package com.example.exam_assistant.app.question_set.question.service;

import com.example.exam_assistant.app.question_set.question.repository.QuestionRepository;
import com.example.exam_assistant.app.question_set.question.dto.Question;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
class QuestionSetServiceImpl implements QuestionSetService {

    private final QuestionRepository questionRepository;

    @Override
    public List<Question> getByQuestionSetId(long id) {
        return questionRepository.findByQuestionSetId(id).stream()
                .map(Question::fromEntity)
                .toList();
    }
}
