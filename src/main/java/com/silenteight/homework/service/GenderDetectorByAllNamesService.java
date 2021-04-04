package com.silenteight.homework.service;

import com.silenteight.homework.model.Gender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class GenderDetectorByAllNamesService {

    Logger log = LoggerFactory.getLogger(GenderDetectorByAllNamesService.class);
    DisplayerOfNamesService displayerOfNamesService;

    public GenderDetectorByAllNamesService(DisplayerOfNamesService displayerOfNamesService) {
        this.displayerOfNamesService = displayerOfNamesService;
    }

    public Gender getGender(String name) {
        log.info("Checking by ->{}", GenderDetectorByAllNamesService.class.getSimpleName());
        return Gender.MALE;
    }
}
