package com.silenteight.homework.service;

import com.silenteight.homework.model.Gender;
import com.silenteight.homework.repository.NamesFromFilesRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class GenderDetectorByFirstNameService {

    Logger log = LoggerFactory.getLogger(GenderDetectorByFirstNameService.class);
    NamesFromFilesRepository namesFromFilesRepository;

    public GenderDetectorByFirstNameService(NamesFromFilesRepository namesFromFilesRepository) {
        this.namesFromFilesRepository = namesFromFilesRepository;
    }

    public Gender getGender(String nameToCheck){
        String firstName=getFirstName(nameToCheck);
        boolean isFemale=namesFromFilesRepository.isNameInFemaleNamesFile(firstName);
        boolean isMale=namesFromFilesRepository.isNameInMaleNamesFile(firstName);
        log.info("Checking by -> {}, name -> {}", GenderDetectorByFirstNameService.class.getSimpleName(),firstName);
        if(isFemale ^ isMale){
            if(isFemale){
                return Gender.FEMALE;
            }else{
                return Gender.MALE;
            }
        }else{
            return Gender.INCONCLUSIVE;
        }
    }

    private String getFirstName(String fullName){
        String[] names=fullName.split(" ");
        return names[0];
    }
}
