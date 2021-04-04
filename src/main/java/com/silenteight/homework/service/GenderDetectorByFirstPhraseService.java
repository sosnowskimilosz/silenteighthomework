package com.silenteight.homework.service;

import com.silenteight.homework.model.Gender;
import com.silenteight.homework.model.NameToCheck;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;

@Service
public class GenderDetectorByFirstPhraseService {

    Logger log = LoggerFactory.getLogger(GenderDetectorByFirstPhraseService.class);
    DisplayerOfNamesService displayerOfNamesService;

    public GenderDetectorByFirstPhraseService(DisplayerOfNamesService displayerOfNamesService) {
        this.displayerOfNamesService = displayerOfNamesService;
    }

    public Gender getGender(String nameToCheck){
        String[] name=nameToCheck.split(" ");
        log.info("Checking by ->{}, name -> {} is {}",GenderDetectorByFirstPhraseService.class.getSimpleName(),name,Gender.MALE);
        return Gender.MALE;
    }

}
