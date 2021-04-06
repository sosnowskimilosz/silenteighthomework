package com.silenteight.homework.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class GenderNotFoundException extends RuntimeException {

    public GenderNotFoundException(String message) {
        super(message);
    }
}
