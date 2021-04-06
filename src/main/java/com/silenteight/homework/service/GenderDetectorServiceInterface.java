package com.silenteight.homework.service;

import com.silenteight.homework.model.Gender;

public interface GenderDetectorServiceInterface {
    Gender getGender(String fullName);
}
