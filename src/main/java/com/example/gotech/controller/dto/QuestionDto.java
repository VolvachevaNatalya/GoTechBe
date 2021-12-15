package com.example.gotech.controller.dto;

import lombok.Data;

@Data
public class QuestionDto {
    private Long id;
    private String key;
    private String label;
    private boolean required;
    private int order;
    private String controlType;
}
