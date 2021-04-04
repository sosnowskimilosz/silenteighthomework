package com.silenteight.homework.model;

public enum Gender {

    FEMALE("FEMALE"),
    MALE("MALE"),
    INCONCLUSIVE("INCONCLUSIVE");

    private String name;

    Gender(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName();
    }
}
