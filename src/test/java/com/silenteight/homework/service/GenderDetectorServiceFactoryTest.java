package com.silenteight.homework.service;

import com.silenteight.homework.HomeworkApplication;
import com.silenteight.homework.model.AlgorithmType;
import com.silenteight.homework.model.Gender;
import com.silenteight.homework.model.NameToCheck;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = HomeworkApplication.class)
public class GenderDetectorServiceFactoryTest {

    @Autowired
    GenderDetectorServiceFactory genderDetectorServiceFactory;

    @Test
    public void shouldReturnMaleGenderByFirstNameVariant() {
        NameToCheck maleFirstNameVariant = new NameToCheck("ALBERT MARIA JANINA", AlgorithmType.FIRST_NAME);
        Gender actualGender = genderDetectorServiceFactory.detectGender(maleFirstNameVariant);
        Assertions.assertEquals(Gender.MALE, actualGender);
    }

    @Test
    public void shouldReturnFemaleGenderByFirstNameVariant() {
        NameToCheck femaleFirstNameVariant = new NameToCheck("MAGDALENA ZBIGNIEW JAN", AlgorithmType.FIRST_NAME);
        Gender actualGender = genderDetectorServiceFactory.detectGender(femaleFirstNameVariant);
        Assertions.assertEquals(Gender.FEMALE, actualGender);
    }

    @Test
    public void shouldReturnInconclusiveGenderByFirstNameVariant() {
        NameToCheck inconclusiveFirstNameVariant = new NameToCheck("notName ZBIGNIEW JAN", AlgorithmType.FIRST_NAME);
        Gender actualGender = genderDetectorServiceFactory.detectGender(inconclusiveFirstNameVariant);
        Assertions.assertEquals(Gender.INCONCLUSIVE, actualGender);
    }

    @Test
    public void shouldReturnMaleGenderByFirstNameVariantWithLowerCase() {
        NameToCheck maleFirstNameVariantWithLowerCase = new NameToCheck("marian jan anna", AlgorithmType.ALL);
        Gender actualGender = genderDetectorServiceFactory.detectGender(maleFirstNameVariantWithLowerCase);
        Assertions.assertEquals(Gender.MALE, actualGender);
    }

    @Test
    public void shouldReturnMaleGenderByAllNameVariant() {
        NameToCheck maleAllNamesVariant = new NameToCheck("ALBERT MARIA WOJCIECH", AlgorithmType.ALL);
        Gender actualGender = genderDetectorServiceFactory.detectGender(maleAllNamesVariant);
        Assertions.assertEquals(Gender.MALE, actualGender);
    }

    @Test
    public void shouldReturnFemaleGenderByAllNameVariant() {
        NameToCheck femaleAllNamesVariant = new NameToCheck("MAGDALENA ZBIGNIEW ADRIANNA", AlgorithmType.ALL);
        Gender actualGender = genderDetectorServiceFactory.detectGender(femaleAllNamesVariant);
        Assertions.assertEquals(Gender.FEMALE, actualGender);
    }

    @Test
    public void shouldReturnInconclusiveGenderByAllNameVariant() {
        NameToCheck inconclusiveAllNamesVariant = new NameToCheck("notName JAN ANNA", AlgorithmType.ALL);
        Gender actualGender = genderDetectorServiceFactory.detectGender(inconclusiveAllNamesVariant);
        Assertions.assertEquals(Gender.INCONCLUSIVE, actualGender);
    }

    @Test
    public void shouldReturnMaleGenderByAllNameVariantWithLowerCase() {
        NameToCheck maleAllNamesVariant = new NameToCheck("marian jan anna", AlgorithmType.ALL);
        Gender actualGender = genderDetectorServiceFactory.detectGender(maleAllNamesVariant);
        Assertions.assertEquals(Gender.MALE, actualGender);
    }
}
