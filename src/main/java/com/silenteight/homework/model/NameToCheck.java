package com.silenteight.homework.model;

public class NameToCheck {

    String name;
    AlgorithmType algorithmType;

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

    public void setName(String name) {
        this.name = name;
    }

    public void setAlgorithmType(AlgorithmType algorithmType) {
        this.algorithmType = algorithmType;
    }
}
