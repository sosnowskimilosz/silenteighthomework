package com.silenteight.homework.service;

import com.silenteight.homework.model.Gender;
import com.silenteight.homework.model.NameToCheck;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class AllPhrasesService {

    Logger log = LoggerFactory.getLogger(AllPhrasesService.class);
    FinderOfTokens finderOfTokens;

    public AllPhrasesService(FinderOfTokens finderOfTokens) {
        this.finderOfTokens = finderOfTokens;
    }

    public void getGender(NameToCheck name) {
        log.info("I'm AllPhraseService and I'm checking -> {}", name.getName());
    }

}
