package com.epam.tasks.third.view;

import org.junit.*;
import java.io.PrintStream;

public class ConsoleResultPrinterTest {
    public static final String CAPTION = "Caption";
    public static final int INPUT_RESULT = 10;
    private static PrintStream outputStream;
    private static MockOutputStream mockOutputStream = new MockOutputStream();
    private static ConsoleResultPrinter resultPrinter;

    @BeforeClass
    public static void toDoBeforeAllTests() {
        outputStream = System.out;
        System.setOut(new PrintStream(mockOutputStream));
        resultPrinter = new ConsoleResultPrinter();
    }

    @AfterClass
    public static void toDoAfterAllTests() {
        System.setOut(outputStream);
    }

    @Before
    public void toDoBeforeTest() {
        mockOutputStream.reset();
    }

    @Test
    public void testPrint() {
        String expected = String.format("%s:\t%s", CAPTION, INPUT_RESULT);

        resultPrinter.print(INPUT_RESULT, CAPTION);
        String actual = mockOutputStream.getContent();

        Assert.assertEquals(expected, actual);
    }
}
