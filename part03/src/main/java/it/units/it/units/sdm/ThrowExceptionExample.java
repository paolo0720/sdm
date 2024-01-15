package it.units.it.units.sdm;

public class ThrowExceptionExample {

    public static void main(String[] args) throws Exception {
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
                System.out.println(text.substring(0, 10));
                throw new Exception("Text length: " + text.length() + " exceeds display size");
            }
            System.out.println(text);
        }
    }

}
