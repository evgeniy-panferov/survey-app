package com.fb.surveyapp.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class Survey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @JsonManagedReference("question_survey")
    @OneToMany(mappedBy = "survey", fetch = FetchType.LAZY)
    private List<Question> questions;

    @Column
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime dateStart;

    @Column
    @DateTimeFormat(pattern ="yyyy-MM-dd HH:mm")
    private LocalDateTime dateFinish;

    @Column
    private String description;

    @Override
    public String toString() {
        return "Survey{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateStart='" + dateStart + '\'' +
                ", dateFinish='" + dateFinish + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
