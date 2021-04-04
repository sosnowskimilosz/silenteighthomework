package com.silenteight.homework.controller;


import com.silenteight.homework.service.DisplayerOfNamesService;
import com.silenteight.homework.service.GenderDetectorByAllPhrasesService;
import com.silenteight.homework.service.GenderDetectorByFirstPhraseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    GenderDetectorByAllPhrasesService genderDetectorByAllPhrasesService;
    GenderDetectorByFirstPhraseService genderDetectorByFirstPhraseService;
    DisplayerOfNamesService displayerOfNamesService;

    public AppController(GenderDetectorByAllPhrasesService genderDetectorByAllPhrasesService,
                         GenderDetectorByFirstPhraseService genderDetectorByFirstPhraseService,
                         DisplayerOfNamesService displayerOfNamesService) {
        this.genderDetectorByAllPhrasesService = genderDetectorByAllPhrasesService;
        this.genderDetectorByFirstPhraseService = genderDetectorByFirstPhraseService;
        this.displayerOfNamesService = displayerOfNamesService;
    }

//    @PostMapping("/checker")
////    public void sendNameToCheck(@RequestBody NameToCheck nameToCheck) throws FileNotFoundException {
////        if (nameToCheck.getAlgorithmType().equals(AlgorithmType.FIRST_WORD)) {
////            genderDetectorByFirstPhraseService.getGender(nameToCheck);
////        } else if (nameToCheck.getAlgorithmType().equals(AlgorithmType.ALL)) {
////            genderDetectorByAllPhrasesService.getGender(nameToCheck);
////        }
////    }

    @GetMapping("allnames/male")
    public String showAllMaleNames(){
        return displayerOfNamesService.showAllMaleNames();
    }

    @GetMapping("allnames/female")
    public String showAllFemaleNames(){
        return displayerOfNamesService.showAllFemaleNames();
    }
}
