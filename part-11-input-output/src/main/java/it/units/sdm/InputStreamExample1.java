package it.units.sdm;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample1 {

    public static void main(String[] args) throws IOException {
        String fileName = "README.md";
        try (InputStream fis = new FileInputStream(fileName)) {
            int count = 0;
            while (fis.read() != -1) {
                count++;
            }
            System.out.println("Read: " + count);
        }
    }
}
