package it.units.it.units.sdm;

public class ErrorFlagsExample {

    public static void main(String[] args) {
        String text1 = "Ciao!";
        String text2 = "Hello, World!";

        FixedSizeDisplay display = new FixedSizeDisplay();
        display.display(text1);
        if (display.checkError()) {
            System.err.println("An error happened displaying the text");
        }

        display.display(text2);
        if (display.checkError()) {
            System.err.println("An error happened displaying the text");
        }
    }

    public static class FixedSizeDisplay {

        private static final int SIZE = 10;

        private boolean error;

        public void display(String text) {
            if (text.length() > SIZE) {
                System.out.println(text.substring(0, 10));
                error = true;
            } else {
                System.out.println(text);
                error = false;
            }
        }

        public boolean checkError() {
            return error;
        }
    }

}
