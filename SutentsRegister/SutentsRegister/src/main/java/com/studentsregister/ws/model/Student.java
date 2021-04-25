package com.studentsregister.ws.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
public class Student extends Person {

    private String registrationNumber;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "student")
    private Set<StudentSchoolyear> studentSchoolYears;

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Set<StudentSchoolyear> getStudentSchoolYears() {
        return studentSchoolYears;
    }

    public void setStudentSchoolYears(Set<StudentSchoolyear> studentSchoolYears) {
        this.studentSchoolYears = studentSchoolYears;
    }
}
