package com.epam.tasks.third.domain.models;

public class CarNotExistsException extends Exception {

    public CarNotExistsException() {
        super("Car not exists");
    }

    public CarNotExistsException(String message) {
        super(message);
    }
}
