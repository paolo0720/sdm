package it.units.sdm;

public class ExceptionChaining {

    public interface Display {
        void display(String text) throws DisplayException;
    }

    class PopupDisplay implements Display {
        @Override
        public void display(String text) throws DisplayException {
            try {
                double fontWidth = 100.0 / text.length();
                // display text with the appropriate width
            } catch (ArithmeticException ex) {
                throw new DisplayException(ex);
            }
        }
    }

    public static class DisplayException extends Exception {

        public DisplayException(Exception ex) {
            super(ex);
        }
    }
}
