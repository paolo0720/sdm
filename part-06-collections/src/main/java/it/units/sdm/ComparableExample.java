package it.units.sdm;

import java.util.Set;
import java.util.TreeSet;

public class ComparableExample {

    static void main() {
        Set<String> citiesOfFvg = Set.of("Trieste", "Udine", "Gorizia", "Pordenone");

        Set<String> naturalOrder = new TreeSet<>(citiesOfFvg);

        IO.println(naturalOrder);
    }
}
