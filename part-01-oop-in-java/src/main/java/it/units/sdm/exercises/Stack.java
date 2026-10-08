package it.units.sdm.exercises;

public interface Stack extends Collection {

    void push(String string);

    String pop();

    String top();
}
