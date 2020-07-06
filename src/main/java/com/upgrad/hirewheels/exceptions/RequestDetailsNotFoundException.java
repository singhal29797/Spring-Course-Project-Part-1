package com.upgrad.hirewheels.exceptions;

public class RequestDetailsNotFoundException extends Exception {

    public RequestDetailsNotFoundException() {}

    public RequestDetailsNotFoundException(String message) {
        super(message);
    }

    public RequestDetailsNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public RequestDetailsNotFoundException(Throwable cause) {
        super(cause);
    }

    public RequestDetailsNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
