package com.studentsregister.ws.request;

import javax.validation.constraints.NotNull;

public class StudentRequest {

    @NotNull(message = "{message.error.student.null.firstName}")
    private String firstName;

    @NotNull(message = "{message.error.student.null.lastName}")
    private String lastName;

    @NotNull(message = "{message.error.student.null.identifierDocument}")
    private String identifierDocument;

    @NotNull(message = "{message.error.student.null.registrationNumber}")
    private String registrationNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdentifierDocument() {
        return identifierDocument;
    }

    public void setIdentifierDocument(String identifierDocument) {
        this.identifierDocument = identifierDocument;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}
