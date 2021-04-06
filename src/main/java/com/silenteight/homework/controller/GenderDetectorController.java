package com.silenteight.homework.controller;


import com.silenteight.homework.model.Gender;
import com.silenteight.homework.model.NameToCheck;
import com.silenteight.homework.service.GenderDetectorServiceFactory;
import com.silenteight.homework.service.NamesDisplayerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenderDetectorController {

    private final GenderDetectorServiceFactory genderDetectorServiceFactory;
    private final NamesDisplayerService namesDisplayerService;

    public GenderDetectorController(GenderDetectorServiceFactory genderDetectorServiceFactory, NamesDisplayerService namesDisplayerService) {
        this.genderDetectorServiceFactory = genderDetectorServiceFactory;
        this.namesDisplayerService = namesDisplayerService;
    }

    @PostMapping("/gender/detector")
    public Gender sendNameToCheck(@RequestBody NameToCheck nameToCheck) {
        return genderDetectorServiceFactory.detectGender(nameToCheck);
    }

    @GetMapping("allnames/male")
    public String showAllMaleNames() {
        return namesDisplayerService.getAllMaleNames();
    }

    @GetMapping("allnames/female")
    public String showAllFemaleNames() {
        return namesDisplayerService.getAllFemaleNames();
    }
}
