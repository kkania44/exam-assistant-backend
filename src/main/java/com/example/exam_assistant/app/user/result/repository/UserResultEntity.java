package com.example.exam_assistant.app.user.result.repository;

import com.example.exam_assistant.app.question_set.question.repository.QuestionEntity;
import com.example.exam_assistant.app.user.repository.UserEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "results")
@NoArgsConstructor
@AllArgsConstructor
class UserResultEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private QuestionEntity question;

    private int correctAnswers;
    private int wrongAnswers;

}
