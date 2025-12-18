package it.units.sdm;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

public class OutputStreamExample {

    static void main() throws IOException {

        try (OutputStream fos = new FileOutputStream("test.dat")) {
            for (int i = 0; i < 10; i++) {
                fos.write(i);
            }
        }
    }
}
