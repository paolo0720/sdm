package it.units.sdm.assignments;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HexDumpTest {

    @Test
    void testOneGroup() throws IOException {
        HexDump hexDump = new HexDump();
        InputStream inputStream = new ByteArrayInputStream(new byte[]{0x25, 0x50});
        StringWriter writer = new StringWriter();

        hexDump.dump(inputStream, writer);

        assertEquals("2550                                     %P", writer.toString());
    }

    @Test
    void testTwoGroups() throws IOException {
        HexDump hexDump = new HexDump();
        InputStream inputStream = new ByteArrayInputStream(new byte[]{0x25, 0x50, 0x44, 0x46});
        StringWriter writer = new StringWriter();

        hexDump.dump(inputStream, writer);

        assertEquals("2550 4446                                %PDF", writer.toString());
    }

    @Test
    void testNonPrintables() throws IOException {
        HexDump hexDump = new HexDump();
        InputStream inputStream = new ByteArrayInputStream(new byte[]{0x25, 0x50, 0x44, 0x46, 0x2d, 0x31, 0x2e, 0x37, 0x0d, 0x0a, 0x25, (byte) 0xb5, (byte) 0xb5, (byte) 0xb5, (byte) 0xb5, 0x0d});
        StringWriter writer = new StringWriter();

        hexDump.dump(inputStream, writer);

        assertEquals("2550 4446 2d31 2e37 0d0a 25b5 b5b5 b50d  %PDF-1.7..%.....", writer.toString());
    }

    @Test
    void testMultipleLines() throws IOException {
        HexDump hexDump = new HexDump();
        InputStream inputStream = new ByteArrayInputStream(new byte[]{
                0x25, 0x50, 0x44, 0x46, 0x2d, 0x31, 0x2e, 0x37, 0x0d, 0x0a, 0x25, (byte) 0xb5, (byte) 0xb5, (byte) 0xb5, (byte) 0xb5, 0x0d,
                0x0a, 0x31, 0x20, 0x30, 0x20, 0x6f, 0x62, 0x6a, 0x0d, 0x0a, 0x3c, 0x3c, 0x2f, 0x54, 0x79, 0x70
        });
        StringWriter writer = new StringWriter();

        hexDump.dump(inputStream, writer);

        assertEquals("""
                2550 4446 2d31 2e37 0d0a 25b5 b5b5 b50d  %PDF-1.7..%.....
                0a31 2030 206f 626a 0d0a 3c3c 2f54 7970  .1 0 obj..<</Typ""", writer.toString());
    }

}