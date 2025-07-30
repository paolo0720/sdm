package it.units.sdm;

import java.util.Set;
import java.util.TreeSet;

public class ComparableExample {

    public static void main(String[] args) {
        Set<String> citiesOfFvg = Set.of("Trieste", "Udine", "Gorizia", "Pordenone");

        Set<String> naturalOrder = new TreeSet<>(citiesOfFvg);

        System.out.println(naturalOrder);
    }
}
