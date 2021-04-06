package com.silenteight.homework.repository;

import com.silenteight.homework.HomeworkApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.io.InputStream;

@SpringBootTest(classes = HomeworkApplication.class)
public class NamesFromFilesRepositoryTest {

    @Autowired
    NamesFromFilesRepository namesFromFilesRepository;

    @Test
    public void fileWithMaleNamesShouldExist() {
        InputStream maleNamesStream = getClass().getClassLoader().getResourceAsStream("male_names.txt");
        Assertions.assertNotNull(maleNamesStream);
    }

    @Test
    public void fileWithFemaleNamesShouldExist() {
        InputStream femaleNamesStream = getClass().getClassLoader().getResourceAsStream("male_names.txt");
        Assertions.assertNotNull(femaleNamesStream);
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
        String maleName = "ADAM";
        Assertions.assertTrue(namesFromFilesRepository.isNameInMaleNamesFile(maleName));
    }

    @Test
    public void nameShouldBeFoundInFemaleNamesFile() {
        String femaleName = "ANNA";
        Assertions.assertTrue(namesFromFilesRepository.isNameInFemaleNamesFile(femaleName));
    }
}
