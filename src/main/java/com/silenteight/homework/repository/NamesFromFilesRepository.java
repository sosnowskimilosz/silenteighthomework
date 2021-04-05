package com.silenteight.homework.repository;

import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

@Repository
public class NamesFromFilesRepository {

    private final File fileWithMaleNames = new File("male_names.txt");
    private final File fileWithFemaleNames = new File("female_names.txt");

    public String getAllFemaleNames() {
        return getNamesFromFiles(fileWithFemaleNames);
    }

    public String getAllMaleNames() {
        return getNamesFromFiles(fileWithMaleNames);
    }

    private String getNamesFromFiles(File file) {
        StringBuilder allNames = new StringBuilder();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                allNames.append(scanner.nextLine()).append("\n");
            }
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
        return allNames.toString().trim();
    }

    public boolean isNameInFemaleNamesFile(String name) {
        return isNameInFile(fileWithFemaleNames, name);
    }

    public boolean isNameInMaleNamesFile(String name) {
        return isNameInFile(fileWithMaleNames, name);
    }

    private boolean isNameInFile(File file, String name) {
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                if (name.equals(scanner.nextLine().toUpperCase().trim())) {
                    return true;
                }
            }
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
        return false;
    }
}

