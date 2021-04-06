package com.silenteight.homework.service;

import com.silenteight.homework.HomeworkApplication;
import com.silenteight.homework.model.Gender;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = HomeworkApplication.class)
public class FirstNameGenderDetectorServiceTest {

    @Autowired
    FirstNameGenderDetectorService firstNameGenderDetectorService;

    @Test
    public void shouldReturnMaleByFirstNameGenderDetector() {
        String maleName = "ADAM MARIA ANNA";
        Assertions.assertEquals(Gender.MALE, firstNameGenderDetectorService.getGender(maleName));
    }

    @Test
    public void shouldReturnFemaleByFirstNameGenderDetector() {
        String femaleName = "MARIA ANNA JAN";
        Assertions.assertEquals(Gender.FEMALE, firstNameGenderDetectorService.getGender(femaleName));
    }

    @Test
    public void shouldReturnInconclusiveByFirstNameGenderDetector() {
        String notName = "notName";
        Assertions.assertEquals(Gender.INCONCLUSIVE, firstNameGenderDetectorService.getGender(notName));
    }
}
