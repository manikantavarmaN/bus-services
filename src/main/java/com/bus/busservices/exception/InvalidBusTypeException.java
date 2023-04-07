package com.bus.busservices.exception;

public class InvalidBusTypeException extends RuntimeException{
    public InvalidBusTypeException(String message) {
        super(message);
    }
}
