package it.units.sdm;

public class ErrorFlagsExample {

    static void main() {
        String text1 = "Ciao!";
        String text2 = "Hello, World!";

        FixedSizeDisplay display = new FixedSizeDisplay();
        display.display(text1);
        if (display.checkError()) {
            IO.println("An error happened displaying the text");
        }

        display.display(text2);
        if (display.checkError()) {
            IO.println("An error happened displaying the text");
        }
    }

    public static class FixedSizeDisplay {

        private static final int SIZE = 10;

        private boolean error;

        public void display(String text) {
            if (text.length() > SIZE) {
                IO.println(text.substring(0, 10));
                error = true;
            } else {
                IO.println(text);
                error = false;
            }
        }

        public boolean checkError() {
            return error;
        }
    }

}
