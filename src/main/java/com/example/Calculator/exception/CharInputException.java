package com.example.Calculator.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "only numbers are acceptable")
public class CharInputException extends Exception {
    public CharInputException(String errorMessage) {
        super(errorMessage);
    }
}
