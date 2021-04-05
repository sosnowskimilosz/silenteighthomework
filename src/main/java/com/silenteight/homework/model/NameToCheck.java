package com.silenteight.homework.model;

public class NameToCheck {

    private final String name;
    private final AlgorithmType algorithmType;

    public NameToCheck(String name, AlgorithmType algorithmType) {
        this.name = name;
        this.algorithmType = algorithmType;
    }

    public String getName() {
        return name;
    }

    public AlgorithmType getAlgorithmType() {
        return algorithmType;
    }

}
