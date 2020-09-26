package com.epam.tasks.third.data;

import org.junit.Assert;
import org.junit.Test;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class FileInputServiceTest {
    private static final String CAR_MODELS_PATH = "src/test/resources/Car_Models.txt";
    private File file = new File(CAR_MODELS_PATH);

    @Test
    public void testReadLine() throws IOException {
        String actual;
        try (FileInputService inputService = new FileInputService(file)) {
            actual = inputService.readLine();
        }

        String expected = "ABT";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testReadAllLines() throws IOException {
        List<String> actual;
        try (FileInputService inputService = new FileInputService(file)) {
            actual = inputService.readAllLines();
        }

        String[] expected = {
                "ABT",
                "AC Schnitzer",
                "Acura",
                "Alfa Romeo"
        };

        Assert.assertArrayEquals(expected, actual.toArray());
    }

    @Test(expected = FileToReadNotInitializedException.class)
    public void testReadLineWithNullReader() throws IOException {
        try (FileInputService inputService = new FileInputService(null)) {
            inputService.readLine();
        }
    }
}
