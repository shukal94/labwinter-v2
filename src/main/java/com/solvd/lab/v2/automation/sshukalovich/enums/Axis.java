package com.solvd.lab.v2.automation.sshukalovich.enums;

public enum Axis {
    X("x"),
    Y("y");

    private String value;

    Axis(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
