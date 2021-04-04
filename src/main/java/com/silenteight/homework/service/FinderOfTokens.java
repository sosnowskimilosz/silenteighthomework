package com.silenteight.homework.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

@Component
public class FinderOfTokens {

    private final File maleNames = new File("male_names.txt");
    private final File femaleNames = new File("female_names.txt");

    public boolean findMaleName(String maleName) throws FileNotFoundException {
        Scanner scanner = new Scanner(maleNames);
        while (scanner.hasNextLine()) {
            if (scanner.nextLine().equals(maleName.toUpperCase())) {
                return true;
            }
        }
        return false;
    }

    public boolean findFemaleName(String femaleName) throws FileNotFoundException {
        Scanner scanner = new Scanner(femaleNames);
        while (scanner.hasNextLine()) {
            if (scanner.nextLine().equals(femaleName.toUpperCase())) {
                return true;
            }
        }
        return false;
    }
}

