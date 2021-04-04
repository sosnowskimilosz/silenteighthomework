package com.silenteight.homework.model;

public enum AlgorithmType {

    ALL("ALL"),
    FIRST_WORD("FIRST_WORD");

    final String name;

    AlgorithmType(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName();
    }
}
