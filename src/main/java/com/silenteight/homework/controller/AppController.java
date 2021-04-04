package com.silenteight.homework.controller;


import com.silenteight.homework.model.Gender;
import com.silenteight.homework.model.NameToCheck;
import com.silenteight.homework.service.DisplayerOfNamesService;
import com.silenteight.homework.service.SelectorOfRightVariantService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    SelectorOfRightVariantService selectorOfRightVariantService;
    DisplayerOfNamesService displayerOfNamesService;

    public AppController(SelectorOfRightVariantService selectorOfRightVariantService,
                         DisplayerOfNamesService displayerOfNamesService) {
        this.selectorOfRightVariantService = selectorOfRightVariantService;
        this.displayerOfNamesService = displayerOfNamesService;
    }

    @PostMapping("/checker")
    public Gender sendNameToCheck(@RequestBody NameToCheck nameToCheck) {
        return selectorOfRightVariantService.detectGender(nameToCheck);
    }

    @GetMapping("allnames/male")
    public String showAllMaleNames() {
        return displayerOfNamesService.getAllMaleNames();
    }

    @GetMapping("allnames/female")
    public String showAllFemaleNames() {
        return displayerOfNamesService.getAllFemaleNames();
    }
}
