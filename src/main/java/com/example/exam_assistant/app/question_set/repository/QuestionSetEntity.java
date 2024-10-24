package com.example.exam_assistant.app.question_set.repository;


import com.example.exam_assistant.app.question_set.dto.CreateQuestionSetDto;
import com.example.exam_assistant.app.user.repository.UserEntity;
import jakarta.persistence.*;
import lombok.*;

import static jakarta.persistence.GenerationType.IDENTITY;
import static lombok.AccessLevel.PRIVATE;

@Entity
@Table(name = "question_sets")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(access = PRIVATE)
public class QuestionSetEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;
    private String name;
    private String description;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    public static QuestionSetEntity fromDtoAndUser(CreateQuestionSetDto dto, UserEntity user) {
        return QuestionSetEntity.builder()
                .name(dto.name())
                .description(dto.description())
                .user(user)
                .build();
    }

}
