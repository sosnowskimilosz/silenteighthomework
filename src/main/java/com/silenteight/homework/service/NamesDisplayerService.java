package com.silenteight.homework.service;

import com.silenteight.homework.repository.NamesFromFilesRepository;
import org.springframework.stereotype.Service;

@Service
public class NamesDisplayerService {

    private final NamesFromFilesRepository namesFromFilesRepository;

    public NamesDisplayerService(NamesFromFilesRepository namesFromFilesRepository) {
        this.namesFromFilesRepository = namesFromFilesRepository;
    }

    public String getAllMaleNames() {
        return namesFromFilesRepository.getAllMaleNames();
    }

    public String getAllFemaleNames() {
        return namesFromFilesRepository.getAllFemaleNames();
    }
}
