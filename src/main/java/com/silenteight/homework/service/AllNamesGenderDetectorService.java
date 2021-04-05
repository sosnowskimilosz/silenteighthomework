package com.silenteight.homework.service;

import com.silenteight.homework.model.Gender;
import com.silenteight.homework.repository.NamesFromFilesRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class AllNamesGenderDetectorService {

    Logger log = LoggerFactory.getLogger(AllNamesGenderDetectorService.class);
    NamesFromFilesRepository namesFromFilesRepository;

    public AllNamesGenderDetectorService(NamesFromFilesRepository namesFromFilesRepository) {
        this.namesFromFilesRepository = namesFromFilesRepository;
    }

    public Gender getGender(String allNames) {
        String[] names = allNames.split(" ");
        int genderEvaluator = evaluateGender(names);
        log.info("Checking by -> {}, names to check -> {}", AllNamesGenderDetectorService.class.getSimpleName(), allNames);
        if (genderEvaluator > 0) {
            return Gender.FEMALE;
        } else if (genderEvaluator < 0) {
            return Gender.MALE;
        } else {
            return Gender.INCONCLUSIVE;
        }
    }

    public int evaluateGender(String[] names) {
        int genderEvaluation = 0;
        for (String name : names) {
            if (namesFromFilesRepository.isNameInFemaleNamesFile(name)) {
                genderEvaluation++;
            } else if (namesFromFilesRepository.isNameInMaleNamesFile(name)) {
                genderEvaluation--;
            }
        }
        return genderEvaluation;
    }
}
