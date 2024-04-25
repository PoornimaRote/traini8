package com.traini8.trainingCenterRegistry.exceptionHandling;

import java.util.List;

import lombok.Data;

@Data
public class ErrorResponse {

    private String message;
    private List<String> errors;

    public ErrorResponse(String message, List<String> errors) {
        this.message = message;
        this.errors = errors;
    }
    public ErrorResponse(String message, String error) {
        this.message = message;
        this.errors = List.of(error);
    }
}