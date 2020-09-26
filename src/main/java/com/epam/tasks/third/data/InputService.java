package com.epam.tasks.third.data;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;

public interface InputService extends Closeable {
    String readLine() throws IOException;

    List<String> readAllLines() throws IOException;
}
