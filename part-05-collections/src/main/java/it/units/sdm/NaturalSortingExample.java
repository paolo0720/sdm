package it.units.sdm;

import java.util.List;

public class NaturalSortingExample {

    public static void main(String[] args) {
        List<String> cities = List.of("Trieste", "Gorizia", "Udine", "Pordenone");
        cities.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
