package com.example.exam_assistant.app.question_set.repository;


import com.example.exam_assistant.app.user.repository.UserEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "question_sets")
@NoArgsConstructor
@AllArgsConstructor
public class QuestionSetEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;
    private String name;
    private String description;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

}
