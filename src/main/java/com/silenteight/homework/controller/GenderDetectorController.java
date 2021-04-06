package com.silenteight.homework.controller;

import com.silenteight.homework.exception.GenderNotFoundException;
import com.silenteight.homework.model.Gender;
import com.silenteight.homework.model.NameToCheck;
import com.silenteight.homework.service.GenderDetectorServiceFactory;
import com.silenteight.homework.service.NamesDisplayerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/gender")
public class GenderDetectorController {

    private final GenderDetectorServiceFactory genderDetectorServiceFactory;
    private final NamesDisplayerService namesDisplayerService;

    public GenderDetectorController(GenderDetectorServiceFactory genderDetectorServiceFactory,
                                    NamesDisplayerService namesDisplayerService) {
        this.genderDetectorServiceFactory = genderDetectorServiceFactory;
        this.namesDisplayerService = namesDisplayerService;
    }

    @PostMapping("/detector")
    public Gender sendNameToCheck(@RequestBody NameToCheck nameToCheck) {
        return genderDetectorServiceFactory.detectGender(nameToCheck);
    }

    @GetMapping("/allnames")
    public String showAllMaleNames(@RequestParam String genderType) {
        if ("female".equals(genderType)) {
            return namesDisplayerService.getAllFemaleNames();
        } else if ("male".equals(genderType)) {
            return namesDisplayerService.getAllMaleNames();
        } else {
            throw new GenderNotFoundException("Bad type of gender");
        }
    }
}
