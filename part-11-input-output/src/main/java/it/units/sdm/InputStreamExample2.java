package it.units.sdm;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class InputStreamExample2 {

    static void main() throws IOException, URISyntaxException {
        URL url = new URI("https://www.google.it").toURL();
        try (InputStream urlStream = url.openStream()) {
            int read;
            while ((read = urlStream.read()) != -1) {
                IO.print((char) read);
            }
        }
    }
}
