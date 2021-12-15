package com.example.gotech.controller.dto;

import lombok.Data;

import java.util.List;

@Data
public class QuestionnaireDto {
    private Long id;
    private List<QuestionDto> questions;
}
