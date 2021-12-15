package com.example.gotech.controller;

import com.example.gotech.controller.dto.DropdownQuestionDto;
import com.example.gotech.controller.dto.QuestionDto;
import com.example.gotech.controller.dto.QuestionnaireDto;
import com.example.gotech.controller.dto.RadiobuttonQuestionDto;
import com.example.gotech.entity.DropdownQuestion;
import com.example.gotech.entity.Question;
import com.example.gotech.entity.Questionnaire;
import com.example.gotech.entity.RadioButtonsQuestion;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class Mapper {
    public QuestionnaireDto questionnaireToQuestionnaireDto(Questionnaire questionnaire) {
        QuestionnaireDto questionnaireDto = new QuestionnaireDto();
        questionnaireDto.setId(questionnaire.getId());
        questionnaireDto.setQuestions(new ArrayList<>());

        questionnaire.getQuestions().forEach(question -> {
            if (question instanceof RadioButtonsQuestion) {
                RadiobuttonQuestionDto radiobuttonQuestionDto = new RadiobuttonQuestionDto();
                RadioButtonsQuestion radioButtonsQuestion = (RadioButtonsQuestion) question;
                setGeneralFields(radioButtonsQuestion, radiobuttonQuestionDto);
                radiobuttonQuestionDto.setOptions(radioButtonsQuestion.getOptions());
                radiobuttonQuestionDto.setFreeText(radioButtonsQuestion.getFreeText());
                questionnaireDto.getQuestions().add(radiobuttonQuestionDto);
            } else if (question instanceof DropdownQuestion) {
                DropdownQuestionDto dropdownQuestionDto = new DropdownQuestionDto();
                DropdownQuestion dropdownQuestion = (DropdownQuestion) question;
                setGeneralFields(dropdownQuestion, dropdownQuestionDto);
                dropdownQuestionDto.setOptions(dropdownQuestion.getOptions());
                questionnaireDto.getQuestions().add(dropdownQuestionDto);
            } else {
                QuestionDto questionDto = new QuestionDto();
                setGeneralFields(question, questionDto);
                questionnaireDto.getQuestions().add(questionDto);
            }
        });

        return questionnaireDto;
    }

    private void setGeneralFields(Question question, QuestionDto questionDto) {
        questionDto.setId(question.getId());
        questionDto.setControlType(question.getControlType());
        questionDto.setKey(question.getKey());
        questionDto.setLabel(question.getLabel());
        questionDto.setRequired(question.isRequired());
        questionDto.setOrder(question.getOrder());
    }
}
