package it.units.sdm;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerExample {

    public static void main(String[] args) {
        Logger logger = Logger.getAnonymousLogger();

        logger.log(Level.INFO, Arrays.toString(args));
        logger.log(Level.INFO, new Supplier<String>() {
            @Override
            public String get() {
                return Arrays.toString(args);
            }
        });
    }
}
