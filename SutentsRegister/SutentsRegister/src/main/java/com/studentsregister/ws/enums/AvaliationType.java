package com.studentsregister.ws.enums;

public enum AvaliationType {
    SCHOOL_WORK(1), TEST(2);

    private int type;

    private AvaliationType(int type) {
        this.type = type;
    }

    public int getType() {
        return this.type;
    }
}
