package it.units.sdm;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class BufferedInputStreamExample {

    public static void main(String[] args) throws IOException {
        String fileName = "README.md";
        try (InputStream fis = new BufferedInputStream(new FileInputStream(fileName))) {
            int count = 0;
            while (fis.read() != -1) {
                count++;
            }
            System.out.println("Read: " + count);
        }

        URL url = new URL("https://www.google.it");
        try (InputStream urlStream = new BufferedInputStream(url.openStream())) {
            int read;
            while ((read = urlStream.read()) != -1) {
                System.out.print((char) read);
            }
        }
    }
}
