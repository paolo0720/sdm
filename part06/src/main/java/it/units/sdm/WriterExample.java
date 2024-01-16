package it.units.sdm;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import static java.nio.charset.StandardCharsets.UTF_8;

public class WriterExample {

    public static void main(String[] args) throws IOException {
        String data = "some data";
        try (Writer writer = new FileWriter("test.txt", UTF_8)) {
            writer.write(data);
        }
    }
}
