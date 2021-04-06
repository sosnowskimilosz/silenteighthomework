package com.silenteight.homework.service;

import com.silenteight.homework.model.Gender;
import com.silenteight.homework.repository.NamesFromFilesRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class FirstNameGenderDetectorService implements GenderDetectorService {

    private final Logger log = LoggerFactory.getLogger(FirstNameGenderDetectorService.class);
    private final NamesFromFilesRepository namesFromFilesRepository;

    public FirstNameGenderDetectorService(NamesFromFilesRepository namesFromFilesRepository) {
        this.namesFromFilesRepository = namesFromFilesRepository;
    }

    public Gender getGender(String nameToCheck) {
        String firstName = getFirstName(nameToCheck.toUpperCase());
        boolean isFemale = namesFromFilesRepository.isNameInFemaleNamesFile(firstName);
        boolean isMale = namesFromFilesRepository.isNameInMaleNamesFile(firstName);
        log.info("Checking by -> {}, name -> {}", FirstNameGenderDetectorService.class.getSimpleName(), firstName);
        if (isFemale ^ isMale) {
            if (isFemale) {
                return Gender.FEMALE;
            } else {
                return Gender.MALE;
            }
        } else {
            return Gender.INCONCLUSIVE;
        }
    }

    private String getFirstName(String fullName) {
        String[] names = fullName.split(" ");
        return names[0];
    }
}
