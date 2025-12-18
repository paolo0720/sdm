package it.units.sdm;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class BufferedInputStreamExample {

    static void main() throws IOException, URISyntaxException {
        String fileName = "README.md";
        try (InputStream fis = new BufferedInputStream(new FileInputStream(fileName))) {
            int count = 0;
            while (fis.read() != -1) {
                count++;
            }
            IO.println("Read: " + count);
        }

        URL url = new URI("https://www.google.it").toURL();
        try (InputStream urlStream = new BufferedInputStream(url.openStream())) {
            int read;
            while ((read = urlStream.read()) != -1) {
                IO.print((char) read);
            }
        }
    }
}
