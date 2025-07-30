package it.units.sdm;

public class CustomExceptionExample {

    public static void main(String[] args) {
        String text1 = "Ciao!";
        String text2 = "Hello, World!";

        FixedSizeDisplay display = new FixedSizeDisplay();
        try {
            display.display(text1);
            display.display(text2);
        } catch (TextTooLongException ex) {
            ex.printStackTrace();
        }
    }

    public static class FixedSizeDisplay {

        private static final int SIZE = 10;

        public void display(String text) throws TextTooLongException {
            if (text.length() > SIZE) {
                System.out.println(text.substring(0, 10));
                throw new TextTooLongException(text.length());
            }
            System.out.println(text);
        }
    }

    public static class TextTooLongException extends Exception {
        public TextTooLongException(int size) {
            super("Text length: " + size + " exceeds display size");
        }
    }
}
