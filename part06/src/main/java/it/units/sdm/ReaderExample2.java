package it.units.sdm;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

import static java.nio.charset.StandardCharsets.UTF_8;

public class ReaderExample2 {

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.google.it");
        try (Reader reader = new InputStreamReader(url.openStream(), UTF_8)) {
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
        }
    }
}
