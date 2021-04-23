package com.studentsregister.ws.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import com.studentsregister.ws.enums.AvaliationType;

import org.springframework.data.annotation.Id;

@Entity
public class LearningActivity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private AvaliationType type;
    private String comment;
    private Long assessmentGrade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AvaliationType getType() {
        return type;
    }

    public void setType(AvaliationType type) {
        this.type = type;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Long getAssessmentGrade() {
        return assessmentGrade;
    }

    public void setAssessmentGrade(Long assessmentGrade) {
        this.assessmentGrade = assessmentGrade;
    }

}
