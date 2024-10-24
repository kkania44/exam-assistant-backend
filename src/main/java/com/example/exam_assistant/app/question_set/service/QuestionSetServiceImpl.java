package com.example.exam_assistant.app.question_set.service;

import com.example.exam_assistant.app.question_set.dto.CreateQuestionSetDto;
import com.example.exam_assistant.app.question_set.dto.QuestionSet;
import com.example.exam_assistant.app.question_set.question.repository.QuestionRepository;
import com.example.exam_assistant.app.question_set.question.dto.Question;
import com.example.exam_assistant.app.question_set.repository.QuestionSetEntity;
import com.example.exam_assistant.app.question_set.repository.QuestionSetRepository;
import com.example.exam_assistant.app.user.exception.UserNotFoundException;
import com.example.exam_assistant.app.user.repository.UserEntity;
import com.example.exam_assistant.app.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
class QuestionSetServiceImpl implements QuestionSetService {

    private final QuestionSetRepository questionSetRepository;
    private final QuestionRepository questionRepository;
    private final UserRepository userRepository;

    @Override
    public List<Question> getByQuestionSetId(long id) {
        return questionRepository.findByQuestionSetId(id).stream()
                .map(Question::fromEntity)
                .toList();
    }

    @Override
    public QuestionSet create(CreateQuestionSetDto questionSet) {
        UserEntity userEntity = userRepository.findById(questionSet.userId())
                .orElseThrow(UserNotFoundException::new);
        QuestionSetEntity questionSetEntity = QuestionSetEntity.fromDtoAndUser(questionSet, userEntity);
        questionSetRepository.save(questionSetEntity);
        return QuestionSet.fromEntity(questionSetEntity);
    }


}
