package com.epam.tasks.third.logic.models;

public class CarNotExistsException extends Exception {

    public CarNotExistsException() {
        super("Car not exists");
    }

    public CarNotExistsException(String message) {
        super(message);
    }
}
