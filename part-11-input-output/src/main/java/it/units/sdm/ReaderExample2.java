package it.units.sdm;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import static java.nio.charset.StandardCharsets.UTF_8;

public class ReaderExample2 {

    static void main() throws IOException, URISyntaxException {
        URL url = new URI("https://www.google.it").toURL();
        try (Reader reader = new InputStreamReader(url.openStream(), UTF_8)) {
            int ch;
            while ((ch = reader.read()) != -1) {
                IO.print((char) ch);
            }
        }
    }
}
