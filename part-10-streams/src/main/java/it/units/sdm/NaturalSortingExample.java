package it.units.sdm;

import java.util.List;

public class NaturalSortingExample {

    static void main() {
        List<String> cities = List.of("Trieste", "Gorizia", "Udine", "Pordenone");
        cities.stream()
                .sorted()
                .forEach(IO::println);
    }
}
