package it.units.sdm.exercises.solution;

import java.util.Objects;

public interface Collection {
    String[] getValues();

    default boolean isEmpty() {
        return getSize() == 0;
    }

    default int getSize() {
        return getValues().length;
    }

    default boolean contains(String value) {
        for (String datum : getValues()) {
            if (Objects.equals(datum, value)) {
                return true;
            }
        }
        return false;
    }
}
