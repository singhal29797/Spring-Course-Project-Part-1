package com.upgrad.hirewheels.exceptions;

public class FuelTypeDetailsNotFoundException extends Exception {

    public FuelTypeDetailsNotFoundException() {}

    public FuelTypeDetailsNotFoundException(String message) {
        super(message);
    }

    public FuelTypeDetailsNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public FuelTypeDetailsNotFoundException(Throwable cause) {
        super(cause);
    }

    public FuelTypeDetailsNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
