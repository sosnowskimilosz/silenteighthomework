package com.silenteight.homework.service;

import com.silenteight.homework.model.Gender;

public interface GenderDetectorService {
    Gender getGender(String fullName);
}
