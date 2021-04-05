package com.silenteight.homework.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class AlgorithmNotFound extends RuntimeException {

    public AlgorithmNotFound(String message) {
        super(message);
    }
}
