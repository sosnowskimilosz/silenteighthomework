package com.silenteight.homework.service;

import com.silenteight.homework.HomeworkApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = HomeworkApplication.class)
public class NamesDisplayerServiceTest {

    Logger logger = LoggerFactory.getLogger(NamesDisplayerServiceTest.class);

    @Autowired
    NamesDisplayerService namesDisplayerService;

    @Test
    public void shouldReturnTrueAccToPositionOfMaleName() {
        String[] maleNames = namesDisplayerService.getAllMaleNames().split("\n");
        logger.info("First male name -> {}", maleNames[0]);
        Assertions.assertTrue("JAN".equals(maleNames[0]));
    }

    @Test
    public void shouldReturnTrueAccToPositionOfFemaleName() {
        String[] femaleNames = namesDisplayerService.getAllFemaleNames().split("\n");
        logger.info("First female name -> {}", femaleNames[0]);
        Assertions.assertTrue("ANNA".equals(femaleNames[0]));
    }
}
