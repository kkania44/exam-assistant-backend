package com.example.exam_assistant.app.user.repository;

import com.example.exam_assistant.app.user.domain.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class UserEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;

    private String username;

    private String email;

    public static UserEntity fromDomain(User user) {
        return UserEntity.builder()
                .email(user.email())
                .username(user.email())
                .build();
    }

}
