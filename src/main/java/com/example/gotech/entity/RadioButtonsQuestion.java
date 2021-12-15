package com.example.gotech.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "radiobutton_question")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class RadioButtonsQuestion extends Question{
    @OneToMany(fetch = FetchType.EAGER)
    private List<Option> options;
    @Column(name = "free_text")
    private String freeText;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        RadioButtonsQuestion that = (RadioButtonsQuestion) o;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
