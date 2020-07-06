package com.upgrad.hirewheels.exceptions;

public class LocationDetailsNotFoundException extends Exception{

    public LocationDetailsNotFoundException() {}

    public LocationDetailsNotFoundException(String message) {
        super(message);
    }

    public LocationDetailsNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public LocationDetailsNotFoundException(Throwable cause) {
        super(cause);
    }

    public LocationDetailsNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
