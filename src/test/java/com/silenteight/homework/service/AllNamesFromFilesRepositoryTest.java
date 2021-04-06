package com.silenteight.homework.service;


import com.silenteight.homework.HomeworkApplication;
import com.silenteight.homework.model.Gender;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = HomeworkApplication.class)
public class AllNamesFromFilesRepositoryTest {

    @Autowired
    AllNamesGenderDetectorService allNamesGenderDetectorService;

    @Test
    public void shouldReturnFemaleByAllNamesGenderDetector() {
        String femaleName="ADAM MARIA ANNA";
        Assertions.assertEquals(Gender.FEMALE, allNamesGenderDetectorService.getGender(femaleName));
    }

    @Test
    public void shouldReturnMaleByAllNamesGenderDetector() {
        String maleName="ANNA MARIA ZBIGNIEW KAROL WOJCIECH";
        Assertions.assertEquals(Gender.MALE, allNamesGenderDetectorService.getGender(maleName));
    }

    @Test
    public void shouldReturnInconclusive() {
        String maleName="notName";
        Assertions.assertEquals(Gender.INCONCLUSIVE, allNamesGenderDetectorService.getGender(maleName));
    }
}
