package com.silenteight.homework.service;

import com.silenteight.homework.repository.NamesFromFilesRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
public class DisplayerOfNamesService {

    NamesFromFilesRepository namesFromFilesRepository;

    public DisplayerOfNamesService(NamesFromFilesRepository namesFromFilesRepository) {
        this.namesFromFilesRepository = namesFromFilesRepository;
    }

    public String showAllMaleNames(){
        return namesFromFilesRepository.getAllMaleNames();
    }

    public String showAllFemaleNames(){
        return namesFromFilesRepository.getAllFemaleNames();
    }
}

