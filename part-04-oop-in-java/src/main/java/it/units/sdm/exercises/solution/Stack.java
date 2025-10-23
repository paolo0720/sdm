package it.units.sdm.exercises.solution;

public interface Stack extends Collection {
    void push(String value);

    String pop();

    default String top() {
        return getValues()[getSize() - 1];
    }
}
