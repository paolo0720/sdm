package it.units.sdm;

public class ThrowExceptionExample {

    static void main() throws Exception {
        String text1 = "Ciao!";
        String text2 = "Hello, World!";

        FixedSizeDisplay display = new FixedSizeDisplay();
        display.display(text1);
        display.display(text2);
    }

    public static class FixedSizeDisplay {

        private static final int SIZE = 10;

        public void display(String text) throws Exception {
            if (text.length() > SIZE) {
                IO.println(text.substring(0, 10));
                throw new Exception("Text length: " + text.length() + " exceeds display size");
            }
            IO.println(text);
        }
    }

}
