package com.aluracursos.screenmatch.exception;

public class ConversionErrorInDurationException extends RuntimeException {
    private String message;
    public ConversionErrorInDurationException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
