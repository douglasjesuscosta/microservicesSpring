package com.studentsregister.ws.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Assessment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String comment;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "assessment_id", referencedColumnName = "id")
    private Set<AssessmentPeriod> avaliationPeriods;

    private boolean passed;

    private Long generalAvaliationGrade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Set<AssessmentPeriod> getAvaliationPeriods() {
        return avaliationPeriods;
    }

    public void setAvaliationPeriods(Set<AssessmentPeriod> avaliationPeriods) {
        this.avaliationPeriods = avaliationPeriods;
    }

    public boolean isPassed() {
        return passed;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }

    public Long getGeneralAvaliationGrade() {
        return generalAvaliationGrade;
    }

    public void setGeneralAvaliationGrade(Long generalAvaliationGrade) {
        this.generalAvaliationGrade = generalAvaliationGrade;
    }

}
