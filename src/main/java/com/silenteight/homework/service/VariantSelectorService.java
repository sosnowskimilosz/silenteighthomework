package com.silenteight.homework.service;

import com.silenteight.homework.exceptions.AlgorithmNotFound;
import com.silenteight.homework.model.AlgorithmType;
import com.silenteight.homework.model.Gender;
import com.silenteight.homework.model.NameToCheck;
import org.springframework.stereotype.Service;

@Service
public class VariantSelectorService {

    AllNamesGenderDetectorService allNamesGenderDetectorService;
    FirstNameGenderDetectorService firstNameGenderDetectorService;

    public VariantSelectorService(AllNamesGenderDetectorService allNamesGenderDetectorService,
                                  FirstNameGenderDetectorService firstNameGenderDetectorService) {
        this.allNamesGenderDetectorService = allNamesGenderDetectorService;
        this.firstNameGenderDetectorService = firstNameGenderDetectorService;
    }

    public Gender detectGender(NameToCheck nameToCheck) {
        if (AlgorithmType.FIRST_NAME.equals(nameToCheck.getAlgorithmType())) {
            return firstNameGenderDetectorService.getGender(nameToCheck.getName());
        }
        if (AlgorithmType.ALL.equals(nameToCheck.getAlgorithmType())) {
            return allNamesGenderDetectorService.getGender(nameToCheck.getName());
        } else {
            throw new AlgorithmNotFound("Bad type of algorithm");
        }
    }
}
