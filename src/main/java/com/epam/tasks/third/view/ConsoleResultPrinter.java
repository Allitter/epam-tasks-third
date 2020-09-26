package com.epam.tasks.third.view;

public class ConsoleResultPrinter implements ResultPrinter {

    public void print(long result, String caption) {
        System.out.printf("%s:\t%d", caption, result);
    }

}
