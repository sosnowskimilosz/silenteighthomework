package com.silenteight.homework.service;

import com.silenteight.homework.model.Gender;
import com.silenteight.homework.model.NameToCheck;
import com.silenteight.homework.repository.NamesFromFilesRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;

@Service
public class GenderDetectorByFirstPhraseService {

    Logger log = LoggerFactory.getLogger(GenderDetectorByFirstPhraseService.class);
    NamesFromFilesRepository namesFromFilesRepository;

    public GenderDetectorByFirstPhraseService(NamesFromFilesRepository namesFromFilesRepository) {
        this.namesFromFilesRepository = namesFromFilesRepository;
    }

    public Gender getGender(String nameToCheck){
        String firstName=getFirstName(nameToCheck);

        log.info("Checking by ->{}, name -> {} is {}",GenderDetectorByFirstPhraseService.class.getSimpleName(),firstName,Gender.MALE);
        return Gender.MALE;
    }

    private String getFirstName(String fullName){
        String[] names=fullName.split(" ");
        return names[0];
    }
}
