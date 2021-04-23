package com.studentsregister.ws.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class AssessmentPeriod {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private int period;
    private Long generalAvaliationPeriodGrade;

    @OneToMany(fetch = FetchType.LAZY)
    private Set<LearningActivity> learningActivities;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public Long getGeneralAvaliationPeriodGrade() {
        return generalAvaliationPeriodGrade;
    }

    public void setGeneralAvaliationPeriodGrade(Long generalAvaliationPeriodGrade) {
        this.generalAvaliationPeriodGrade = generalAvaliationPeriodGrade;
    }

    public Set<LearningActivity> getLearningActivities() {
        return learningActivities;
    }

    public void setLearningActivities(Set<LearningActivity> learningActivities) {
        this.learningActivities = learningActivities;
    }

}
