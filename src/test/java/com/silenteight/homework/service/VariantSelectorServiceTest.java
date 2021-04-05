package com.silenteight.homework.service;

import com.silenteight.homework.HomeworkApplication;
import com.silenteight.homework.model.AlgorithmType;
import com.silenteight.homework.model.Gender;
import com.silenteight.homework.model.NameToCheck;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = HomeworkApplication.class)
public class VariantSelectorServiceTest {

    @Autowired
    VariantSelectorService variantSelectorService;

    @Test
    public void shouldReturnFirstNameVariant(){
        NameToCheck nameToCheck=new NameToCheck("Adam Maria", AlgorithmType.FIRST_NAME);
        Gender gender = variantSelectorService.detectGender(nameToCheck);
        System.out.println(gender.getClass().getSimpleName());
    }

}
