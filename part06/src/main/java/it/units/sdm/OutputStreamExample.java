package it.units.sdm;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExample {

    public static void main(String[] args) throws IOException {

        try (OutputStream fos = new FileOutputStream("test.dat")) {
            for (int i = 0; i < 10; i++) {
                fos.write(i);
            }
        }

    }
}
