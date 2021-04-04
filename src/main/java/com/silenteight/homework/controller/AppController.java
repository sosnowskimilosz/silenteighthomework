package com.silenteight.homework.controller;

import com.silenteight.homework.model.AlgorithmType;
import com.silenteight.homework.model.NameToCheck;
import com.silenteight.homework.service.AllPhrasesService;
import com.silenteight.homework.service.FirstPhraseService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

@RestController
public class AppController {

    AllPhrasesService allPhrasesService;
    FirstPhraseService firstPhraseService;

    public AppController(AllPhrasesService allPhrasesService, FirstPhraseService firstPhraseService) {
        this.allPhrasesService = allPhrasesService;
        this.firstPhraseService = firstPhraseService;
    }

    @PostMapping("/checker")
    public void sendNameToCheck(@RequestBody NameToCheck nameToCheck) throws FileNotFoundException {
        if (nameToCheck.getAlgorithmType().equals(AlgorithmType.FIRST_WORD)) {
            firstPhraseService.getGender(nameToCheck);
        } else if (nameToCheck.getAlgorithmType().equals(AlgorithmType.ALL)) {
            allPhrasesService.getGender(nameToCheck);
        }
    }
}
