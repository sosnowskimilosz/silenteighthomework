package com.silenteight.homework.service;

import com.silenteight.homework.exceptions.AlgorithmNotFound;
import com.silenteight.homework.model.AlgorithmType;
import com.silenteight.homework.model.Gender;
import com.silenteight.homework.model.NameToCheck;
import org.springframework.stereotype.Service;

@Service
public class SelectorOfRightVariantService {

    GenderDetectorByAllNamesService genderDetectorByAllNamesService;
    GenderDetectorByFirstNameService genderDetectorByFirstNameService;

    public SelectorOfRightVariantService(GenderDetectorByAllNamesService genderDetectorByAllNamesService,
                                         GenderDetectorByFirstNameService genderDetectorByFirstNameService) {
        this.genderDetectorByAllNamesService = genderDetectorByAllNamesService;
        this.genderDetectorByFirstNameService = genderDetectorByFirstNameService;
    }

    public Gender detectGender(NameToCheck nameToCheck) {
        if (AlgorithmType.FIRST_NAME.equals(nameToCheck.getAlgorithmType())) {
            return genderDetectorByFirstNameService.getGender(nameToCheck.getName());
        }if (AlgorithmType.ALL.equals(nameToCheck.getAlgorithmType())) {
            return genderDetectorByAllNamesService.getGender(nameToCheck.getName());
        } else {
            throw new AlgorithmNotFound("Bad type of algorithm");
        }
    }
}
