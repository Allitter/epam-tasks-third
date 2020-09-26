package com.epam.tasks.third.domain.models;

public class IncorrectArgumentException extends Exception {

    public IncorrectArgumentException() {
        super("Incorrect argument exception");
    }

    public IncorrectArgumentException(String message) {
        super(message);
    }
}
