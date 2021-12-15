package com.example.gotech.controller;

import com.example.gotech.controller.dto.QuestionnaireDto;
import com.example.gotech.service.QuestionnaireService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/questionnaires")
public class QuestionnaireController {
    private final QuestionnaireService questionnaireService;
    private final Mapper mapper;

    public QuestionnaireController(QuestionnaireService questionnaireService, Mapper mapper) {
        this.questionnaireService = questionnaireService;
        this.mapper = mapper;
    }

    @GetMapping("/{id}")
    public QuestionnaireDto getQuestionnaire(@PathVariable Long id) {
        return mapper.questionnaireToQuestionnaireDto(  questionnaireService.getQuestionnaireById(id));
    }
}
