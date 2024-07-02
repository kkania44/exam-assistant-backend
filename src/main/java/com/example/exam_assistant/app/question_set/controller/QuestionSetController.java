package com.example.exam_assistant.app.question_set.controller;

import com.example.exam_assistant.app.question_set.question.dto.Question;
import com.example.exam_assistant.app.question_set.question.service.QuestionSetService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/question_set")
@RequiredArgsConstructor
class QuestionSetController {

    private final QuestionSetService questionSetService;

    @GetMapping("/{id}/questions")
    List<Question> getQuestionsBySetId(@PathVariable("id") long id) {
        return questionSetService.getByQuestionSetId(id);
    }
}
