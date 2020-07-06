package com.upgrad.hirewheels.exceptions;

public class ActivityDetailsNotFoundException extends Exception {

    public ActivityDetailsNotFoundException() {}

    public ActivityDetailsNotFoundException(String message) {
        super(message);
    }

    public ActivityDetailsNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ActivityDetailsNotFoundException(Throwable cause) {
        super(cause);
    }

    public ActivityDetailsNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
