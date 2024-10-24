package com.example.exam_assistant.app.question_set.controller;

import com.example.exam_assistant.app.question_set.dto.CreateQuestionSetDto;
import com.example.exam_assistant.app.question_set.dto.QuestionSet;
import com.example.exam_assistant.app.question_set.question.dto.Question;
import com.example.exam_assistant.app.question_set.service.QuestionSetService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    QuestionSet createSet(@RequestBody CreateQuestionSetDto questionSet) {
        return questionSetService.create(questionSet);
    }

}
