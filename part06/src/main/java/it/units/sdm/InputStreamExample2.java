package it.units.sdm;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class InputStreamExample2 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.google.it");
        try (InputStream urlStream = url.openStream()) {
            int read;
            while ((read = urlStream.read()) != -1) {
                System.out.print((char) read);
            }
        }
    }
}
