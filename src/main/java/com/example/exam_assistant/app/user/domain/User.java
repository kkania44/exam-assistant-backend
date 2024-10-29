package com.example.exam_assistant.app.user.domain;

import com.example.exam_assistant.app.user.api.dto.CreateUserDto;
import com.example.exam_assistant.app.user.repository.UserEntity;
import lombok.Builder;

@Builder
public record User(long id, String username, String email) {

    public static User fromEntity(UserEntity userEntity) {
        return new User(userEntity.getId(), userEntity.getUsername(), userEntity.getEmail());
    }

    public static User fromRequest(CreateUserDto createUserDto) {
        return null;
    }
}
