package it.units.it.units.sdm;

public class ErrorCodeExample {

    public static void main(String[] args) {
        String text1 = "Ciao!";
        String text2 = "Hello, World!";

        FixedSizeDisplay display = new FixedSizeDisplay();
        int result = display.display(text1);
        if (result != FixedSizeDisplay.OK) {
            System.err.println("An error happened displaying the text: " + result);
        }

        result = display.display(text2);
        if (result != FixedSizeDisplay.OK) {
            System.err.println("An error happened displaying the text: " + result);
        }
    }

    public static class FixedSizeDisplay {

        public static final int OK = 0;
        public static final int TEXT_LENGTH_TOO_BIG = 1;

        private static final int SIZE = 10;

        public int display(String text) {
            if (text.length() > SIZE) {
                System.out.println(text.substring(0, 10));
                return TEXT_LENGTH_TOO_BIG;
            } else {
                System.out.println(text);
                return OK;
            }
        }
    }

}
