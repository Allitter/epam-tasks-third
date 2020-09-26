package com.epam.tasks.third.data;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class FileInputService implements InputService {
    private BufferedReader reader;
    private File fileToRead;

    public FileInputService(File file) throws IOException {
        fileToRead = file;
        open();
    }

    public String readLine() throws IOException {
        String line = reader.readLine();
        return line;
    }

    public List<String> readAllLines() throws IOException {
        List<String> result = new LinkedList();
        String line;

        while ((line = readLine()) != null) {
            result.add(line);
        }

        return result;
    }

    public void setFileToRead(File fileToRead) throws IOException {
        this.fileToRead = fileToRead;
        open();
    }

    protected void open() throws IOException {
        if (fileToRead == null) {
            throw new FileToReadNotInitializedException();
        }

        reader = new BufferedReader(new FileReader(fileToRead));
    }

    @Override
    public void close() throws IOException {
        reader.close();
    }

}
