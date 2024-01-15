package it.units.it.units.sdm;

public class NumberStack<N extends Number> extends Stack<N> {

    double average() {
        double sum = 0;
        for (Number number : data) {
            sum += number.doubleValue();
        }
        return sum / getSize();
    }
}
