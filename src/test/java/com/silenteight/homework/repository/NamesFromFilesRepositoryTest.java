package com.silenteight.homework.repository;

import com.silenteight.homework.HomeworkApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;

@SpringBootTest(classes = HomeworkApplication.class)
public class NamesFromFilesRepositoryTest {

    @Autowired
    NamesFromFilesRepository namesFromFilesRepository;

    @Test
    public void fileWithFemaleNamesShouldExist() {
        File femaleNamesFile = new File("female_names.txt");
        Assertions.assertTrue(femaleNamesFile.exists());
    }

    @Test
    public void fileWithMaleNamesShouldExist() {
        File maleNamesFile = new File("male_names.txt");
        Assertions.assertTrue(maleNamesFile.exists());
    }

    @Test
    public void gettingAllMaleNamesFromFileShouldNotBeNull() {
        Assertions.assertNotNull(namesFromFilesRepository.getAllMaleNames());
    }

    @Test
    public void gettingAllFemaleNamesFromFileShouldNotBeNull() {
        Assertions.assertNotNull(namesFromFilesRepository.getAllMaleNames());
    }

    @Test
    public void nameShouldBeFoundInMaleNamesFile() {
        String maleName = "MARIAN";
        Assertions.assertTrue(namesFromFilesRepository.isNameInMaleNamesFile(maleName));
    }

    @Test
    public void nameShouldBeFoundInFemaleNamesFile() {
        String femaleName = "ANIA";
        Assertions.assertTrue(namesFromFilesRepository.isNameInMaleNamesFile(femaleName));
    }
}
