package com.example.exam_assistant.app.user;

import com.example.exam_assistant.app.user.api.dto.CreateUserDto;
import com.example.exam_assistant.app.user.domain.User;
import com.example.exam_assistant.app.user.exception.UserAlreadyExistsException;
import com.example.exam_assistant.app.user.exception.UserNotFoundException;
import com.example.exam_assistant.app.user.repository.UserEntity;
import com.example.exam_assistant.app.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User getById(long id) {
        return userRepository.findById(id)
                .map(User::fromEntity)
                .orElseThrow(UserNotFoundException::new);
    }

    public User create(CreateUserDto userDto) {
        Optional<UserEntity> userOptional = userRepository.findByEmail(userDto.email());
        if (userOptional.isPresent()) {
            throw new UserAlreadyExistsException();
        }
        UserEntity user = UserEntity.builder()
                .email(userDto.email())
                .username(userDto.username())
                .build();
        UserEntity savedUser = userRepository.save(user);
        return User.fromEntity(savedUser);
    }

}
