package it.units.sdm;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample3 {

    static void main() throws IOException {
        byte[] byteArray = new byte[]{'H', 'e', 'l', 'l', 'o', ',', ' ', 'W', 'o', 'r', 'l', 'd', '!'};
        try (InputStream is = new ByteArrayInputStream(byteArray)) {
            int read;
            while ((read = is.read()) != -1) {
                IO.print((char) read);
            }
        }
    }
}
