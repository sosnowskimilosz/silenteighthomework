package com.silenteight.homework.service;

import com.silenteight.homework.model.Gender;
import com.silenteight.homework.model.NameToCheck;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class GenderDetectorByAllPhrasesService {

    Logger log = LoggerFactory.getLogger(GenderDetectorByAllPhrasesService.class);
    DisplayerOfNamesService displayerOfNamesService;

    public GenderDetectorByAllPhrasesService(DisplayerOfNamesService displayerOfNamesService) {
        this.displayerOfNamesService = displayerOfNamesService;
    }

    public Gender getGender(String name) {
        log.info("Checking by ->{}",GenderDetectorByAllPhrasesService.class.getSimpleName());
        return Gender.MALE;
    }

}
