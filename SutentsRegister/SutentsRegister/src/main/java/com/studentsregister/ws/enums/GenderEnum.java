package com.studentsregister.ws.enums;

public enum GenderEnum {
    FEMALE("F"), MALE("M"), OTHER("O");

    private String gender;

    GenderEnum(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return this.gender;
    }
}
