package com.epam.tasks.third.data;

import java.io.IOException;

public class FileToReadNotInitializedException extends IOException {

    public FileToReadNotInitializedException() {
        super("Input file not initialized");
    }

    public FileToReadNotInitializedException(String message) {
        super(message);
    }
}
