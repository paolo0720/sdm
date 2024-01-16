package it.units.sdm;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import static java.nio.charset.StandardCharsets.UTF_8;

public class ReaderExample1 {

    public static void main(String[] args) throws IOException {
        String fileName = "README.md";
        try (Reader reader = new InputStreamReader(new FileInputStream(fileName), UTF_8)) {
            int ch = -1;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
        }

        try (Reader reader = new FileReader(fileName, UTF_8)) {
            int ch = -1;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
        }
    }
}
