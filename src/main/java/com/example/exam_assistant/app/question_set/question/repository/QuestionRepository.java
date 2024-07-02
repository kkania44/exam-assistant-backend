package com.example.exam_assistant.app.question_set.question.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<QuestionEntity, Long> {

    List<QuestionEntity> findByQuestionSetId(long questionSetId);

}
