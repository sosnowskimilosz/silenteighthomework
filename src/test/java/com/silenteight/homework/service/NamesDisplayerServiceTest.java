package com.silenteight.homework.service;

import com.silenteight.homework.HomeworkApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = HomeworkApplication.class)
public class NamesDisplayerServiceTest {

    @Autowired
    NamesDisplayerService namesDisplayerService;

    @Test
    public void shouldReturnTrueAccToPositionOfMaleName() {
        String[] maleNames = namesDisplayerService.getAllMaleNames().split(" ");
        Assertions.assertTrue(maleNames[0] == "JAN");
    }

    @Test
    public void shouldReturnTrueAccToPositionOfFemaleName() {
        String[] femaleNames = namesDisplayerService.getAllMaleNames().split(" ");
        Assertions.assertTrue(femaleNames[0] == "ANNA");
    }
}
