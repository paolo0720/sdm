package it.units.sdm.exercises.solution;

import java.util.Objects;

public interface List extends Collection {

    void add(String value);

    default String get(int index) {
        return getValues()[index];
    }

    void insert(int index, String value);

    void remove(int index);

    default int indexOf(String value) {
        for (int i = 0; i < getSize(); i++) {
            if (Objects.equals(get(i), value)) {
                return i;
            }
        }
        return -1;
    }
}
