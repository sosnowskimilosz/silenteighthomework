package com.silenteight.homework.repository;

import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

@Repository
public class NamesFromFilesRepository {

    public String getAllFemaleNames() {
        InputStream femaleNamesStream = getClass().getClassLoader().getResourceAsStream("female_names.txt");
        return getNamesFromStream(femaleNamesStream);
    }

    public String getAllMaleNames() {
        InputStream maleNamesStream = getClass().getClassLoader().getResourceAsStream("male_names.txt");
        return getNamesFromStream(maleNamesStream);
    }

    private String getNamesFromStream(InputStream inputStream) {
        StringBuilder allNames = new StringBuilder();
        try (Scanner scanner = new Scanner(inputStream, "UTF-8")) {
            while (scanner.hasNext()) {
                allNames.append(scanner.nextLine()).append("\n");
            }
        }
        return allNames.toString().trim();
    }

    public boolean isNameInFemaleNamesFile(String name) {
        InputStream femaleNamesStream = getClass().getClassLoader().getResourceAsStream("female_names.txt");
        return isNameInStream(femaleNamesStream, name);
    }

    public boolean isNameInMaleNamesFile(String name) {
        InputStream maleNamesStream = getClass().getClassLoader().getResourceAsStream("male_names.txt");
        return isNameInStream(maleNamesStream, name);
    }

    private boolean isNameInStream(InputStream inputStream, String name) {
        try (Scanner scanner = new Scanner(inputStream, "UTF-8")) {
            while (scanner.hasNext()) {
                if (name.equalsIgnoreCase(scanner.nextLine())) {
                    return true;
                }
            }
        }
        return false;
    }
}
