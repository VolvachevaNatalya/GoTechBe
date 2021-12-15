package com.example.gotech.controller.dto;

import com.example.gotech.entity.Option;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class RadiobuttonQuestionDto extends QuestionDto {
    public RadiobuttonQuestionDto() {
        super();
    }
    private List<Option> options;
    private String freeText;
}
