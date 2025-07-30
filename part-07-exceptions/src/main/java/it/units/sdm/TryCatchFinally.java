package it.units.sdm;

public class TryCatchFinally {

    public static void main(String[] args) throws TimeoutException {
        var storage = new Storage();
        try {
            for (String arg : args) {
                storage.store(arg);
            }
        } finally {
            storage.close();
        }
    }

    public static class Storage {
        public void store(String text) throws TimeoutException {
            //do something
        }

        public void close() {
            //close
        }
    }

    public static class TimeoutException extends Exception {

    }
}
