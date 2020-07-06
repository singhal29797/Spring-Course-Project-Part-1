package com.upgrad.hirewheels.exceptions;

public class RequestStatusDetailsNotFoundException extends Exception {

    public RequestStatusDetailsNotFoundException() {}

    public RequestStatusDetailsNotFoundException(String message) {
        super(message);
    }

    public RequestStatusDetailsNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public RequestStatusDetailsNotFoundException(Throwable cause) {
        super(cause);
    }

    public RequestStatusDetailsNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
