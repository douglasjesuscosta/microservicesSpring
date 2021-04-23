package com.studentsregister.ws.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
public class Student extends Person {

    private String registrationNumber;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "student_id")
    private StudentSchoolyear suStudentSchoolyear;

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

}
