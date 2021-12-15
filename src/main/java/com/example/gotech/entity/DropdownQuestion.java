package com.example.gotech.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "dropdown_question")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class DropdownQuestion extends Question {
    @OneToMany(fetch = FetchType.EAGER)
    private List<Option> options;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        DropdownQuestion that = (DropdownQuestion) o;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
