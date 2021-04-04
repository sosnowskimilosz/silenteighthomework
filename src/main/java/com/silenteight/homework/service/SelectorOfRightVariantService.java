package com.silenteight.homework.service;

import com.silenteight.homework.exceptions.AlgorithmNotFound;
import com.silenteight.homework.model.AlgorithmType;
import com.silenteight.homework.model.Gender;
import com.silenteight.homework.model.NameToCheck;
import org.springframework.stereotype.Service;


@Service
public class SelectorOfRightVariantService {

    GenderDetectorByAllPhrasesService genderDetectorByAllPhrasesService;
    GenderDetectorByFirstPhraseService genderDetectorByFirstPhraseService;

    public SelectorOfRightVariantService(GenderDetectorByAllPhrasesService genderDetectorByAllPhrasesService,
                                         GenderDetectorByFirstPhraseService genderDetectorByFirstPhraseService) {
        this.genderDetectorByAllPhrasesService = genderDetectorByAllPhrasesService;
        this.genderDetectorByFirstPhraseService = genderDetectorByFirstPhraseService;
    }

    public Gender detectGender(NameToCheck nameToCheck) {
        if (AlgorithmType.FIRST_WORD.equals(nameToCheck.getAlgorithmType())) {
            return genderDetectorByFirstPhraseService.getGender(nameToCheck.getName());
        }if (AlgorithmType.ALL.equals(nameToCheck.getAlgorithmType())) {
            return genderDetectorByAllPhrasesService.getGender(nameToCheck.getName());
        } else {
            throw new AlgorithmNotFound("Bad type of algorithm");
        }
    }
}
