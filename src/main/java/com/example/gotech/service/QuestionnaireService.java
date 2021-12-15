package com.example.gotech.service;

import com.example.gotech.entity.Questionnaire;
import com.example.gotech.repository.QuestionnaireRepository;
import org.springframework.stereotype.Service;

@Service
public class QuestionnaireService {
    private final QuestionnaireRepository questionnaireRepository;

    public QuestionnaireService(QuestionnaireRepository questionnaireRepository) {
        this.questionnaireRepository = questionnaireRepository;
    }

    public Questionnaire getQuestionnaireById(Long id) {
        return questionnaireRepository.findById(id).orElseThrow(RuntimeException::new);

    }
}
