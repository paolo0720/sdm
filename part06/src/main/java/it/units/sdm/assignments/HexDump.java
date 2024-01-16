package it.units.sdm.assignments;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.HexFormat;

public class HexDump {

    public static void main(String[] args) throws IOException {
        HexDump hexDump = new HexDump();
        try (FileInputStream inputStream = new FileInputStream(args[0])) {
            hexDump.dump(inputStream, new PrintWriter(System.out, true));
        }
    }

    public void dump(InputStream inputStream, Writer writer) throws IOException {
        StringBuilder binary = new StringBuilder();
        StringBuilder text = new StringBuilder();
        String lineSeparator = "";
        int groups = 0;
        int read;
        while ((read = inputStream.read()) != -1) {
            binary.append(HexFormat.of().toHexDigits((byte) read));
            text.append(read < 32 || read > 126 ? '.' : (char) read);
            if (++groups % 2 == 0) {
                binary.append(' ');
            }
            if (groups % 16 == 0) {
                writer.append(lineSeparator).append(binary).append(" ").append(text);
                binary.delete(0, binary.length());
                text.delete(0, text.length());
                lineSeparator = "\n";
            }

        }
        if (!binary.isEmpty()) {
            writer.append(binary).append(" ".repeat(41 - binary.length())).append(text);
        }
    }
}
