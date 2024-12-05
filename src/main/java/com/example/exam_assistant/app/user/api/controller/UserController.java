package com.example.exam_assistant.app.user.api.controller;

import com.example.exam_assistant.app.user.UserService;
import com.example.exam_assistant.app.user.api.dto.CreateUserDto;
import com.example.exam_assistant.app.user.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
class UserController {

    private final UserService userService;

    @GetMapping("/{id}")
    User getById(@PathVariable("id") long id) {
        return userService.getById(id);
    }

    @PostMapping
    User create(@RequestBody CreateUserDto user) {
        return userService.create(user);
    }

}
