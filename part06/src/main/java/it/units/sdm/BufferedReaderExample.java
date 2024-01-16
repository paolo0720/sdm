package it.units.sdm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import static java.nio.charset.StandardCharsets.UTF_8;

public class BufferedReaderExample {

    public static void main(String[] args) throws IOException {
        String fileName = "part06/src/main/resources/it/units/sdm/commedia.txt";

        try (Reader reader = new BufferedReader(new FileReader(fileName, UTF_8))) {
            int ch = -1;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName, UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName, UTF_8))) {
            reader.lines().forEach(System.out::println);
        }

    }
}
