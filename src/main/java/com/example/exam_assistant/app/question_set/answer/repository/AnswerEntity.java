package com.example.exam_assistant.app.question_set.answer.repository;


import com.example.exam_assistant.app.question_set.question.repository.QuestionEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "answers")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AnswerEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;
    private String content;
    private boolean correct;
    @ManyToOne
    private QuestionEntity question;

}
