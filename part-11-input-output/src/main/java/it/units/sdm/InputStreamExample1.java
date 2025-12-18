package it.units.sdm;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample1 {

    static void main() throws IOException {
        String fileName = "C:\\Users\\pvercesi\\OneDrive - ESTECO SpA\\sdm\\units 2025-2026\\Programming in Java - Part 11 - Basics of Input and Output.pptx";
        try (InputStream fis = new BufferedInputStream(new FileInputStream(fileName))) {
            int count = 0;
            while (fis.read() != -1) {
                count++;
            }
            IO.println("Read: " + count);
        }
    }
}
