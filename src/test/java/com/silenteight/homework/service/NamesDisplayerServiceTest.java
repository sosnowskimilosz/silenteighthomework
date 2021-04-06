package com.silenteight.homework.service;

import com.silenteight.homework.HomeworkApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = HomeworkApplication.class)
public class NamesDisplayerServiceTest {

    @Autowired
    NamesDisplayerService namesDisplayerService;

    
}
