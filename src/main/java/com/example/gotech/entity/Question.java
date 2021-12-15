package com.example.gotech.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "question")
@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "questionnaire_id")
    private Questionnaire questionnaire;
    @Column(name = "key")
    private String key;
    @Column(name = "label")
    private String label;
    @Column(name = "required")
    private boolean required;
    @Column(name = "order")
    private int order;
    @Column(name = "control_type")
    private String controlType;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Question question = (Question) o;
        return Objects.equals(id, question.id);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}