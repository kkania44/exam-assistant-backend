package com.example.exam_assistant.app.question_set.question.repository;


import com.example.exam_assistant.app.question_set.answer.repository.AnswerEntity;
import com.example.exam_assistant.app.question_set.repository.QuestionSetEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

import static jakarta.persistence.FetchType.LAZY;
import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "questions")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class QuestionEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;

    private String content;

    private int numberOfCorrectAnswers;

    @ManyToOne
    @JoinColumn(name = "question_set_id")
    private QuestionSetEntity questionSet;

    @OneToMany(fetch = LAZY, orphanRemoval = true)
    @JoinColumn(name = "question_id")
    private Set<AnswerEntity> answers = new HashSet<>();

}
