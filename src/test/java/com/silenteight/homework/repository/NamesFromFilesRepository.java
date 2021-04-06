package com.silenteight.homework.repository;

import com.silenteight.homework.HomeworkApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;

@SpringBootTest(classes = HomeworkApplication.class)
public class NamesFromFilesRepository {

    @Autowired
    NamesFromFilesRepository namesFromFilesRepository;

    @Test
    public void fileWithFemaleNamesShouldExist(){
        File femaleNamesFile=new File("female_names.txt");
        Assertions.assertTrue(femaleNamesFile.exists());
    }

    @Test
    public void fileWithMaleNamesShouldExist(){
        File maleNamesFile=new File("male_names.txt");
        Assertions.assertTrue(maleNamesFile.exists());
    }

}
