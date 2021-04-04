package com.silenteight.homework.service;

import com.silenteight.homework.model.NameToCheck;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;

@Service
public class FirstPhraseService {

    Logger log = LoggerFactory.getLogger(FirstPhraseService.class);
    FinderOfTokens finderOfTokens;

    public FirstPhraseService(FinderOfTokens finderOfTokens) {
        this.finderOfTokens = finderOfTokens;
    }

    public void getGender(NameToCheck name) throws FileNotFoundException {
        log.info("I'm FirstPhraseService and I'm checking -> {}", name.getName());
        System.out.println("is in female file? -> "+finderOfTokens.findFemaleName(name.getName()));
        System.out.println("is in male file? -> "+finderOfTokens.findMaleName(name.getName()));
    }
}
