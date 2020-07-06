package com.upgrad.hirewheels.exceptions;

public class VehicleCategoryDetailsNotFoundException extends Exception {

    public VehicleCategoryDetailsNotFoundException() {}

    public VehicleCategoryDetailsNotFoundException(String message) {
        super(message);
    }

    public VehicleCategoryDetailsNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public VehicleCategoryDetailsNotFoundException(Throwable cause) {
        super(cause);
    }

    public VehicleCategoryDetailsNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
