package com.silenteight.homework.service;

import com.silenteight.homework.model.Gender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class AllNamesGenderDetectorService {

    Logger log = LoggerFactory.getLogger(AllNamesGenderDetectorService.class);
    NamesDisplayerService namesDisplayerService;

    public AllNamesGenderDetectorService(NamesDisplayerService namesDisplayerService) {
        this.namesDisplayerService = namesDisplayerService;
    }

    public Gender getGender(String name) {
        log.info("Checking by ->{}", AllNamesGenderDetectorService.class.getSimpleName());
        return Gender.MALE;
    }
}
