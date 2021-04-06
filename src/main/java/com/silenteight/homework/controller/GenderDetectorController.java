package com.silenteight.homework.controller;


import com.silenteight.homework.model.Gender;
import com.silenteight.homework.model.NameToCheck;
import com.silenteight.homework.service.NamesDisplayerService;
import com.silenteight.homework.service.VariantSelectorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenderDetectorController {

    private final VariantSelectorService variantSelectorService;
    private final NamesDisplayerService namesDisplayerService;

    public GenderDetectorController(VariantSelectorService variantSelectorService,
                                    NamesDisplayerService namesDisplayerService) {
        this.variantSelectorService = variantSelectorService;
        this.namesDisplayerService = namesDisplayerService;
    }

    @PostMapping("/gender/detector")
    public Gender sendNameToCheck(@RequestBody NameToCheck nameToCheck) {
        return variantSelectorService.detectGender(nameToCheck);
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
