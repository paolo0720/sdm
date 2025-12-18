package it.units.sdm;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StringConcatenationByReductionExample {

    static void main() {
        List<String> cities = Arrays.asList("Trieste", "Gorizia", "Udine", "Pordenone");

        String reduced1 = cities.stream().reduce("", (x, y) -> x + ", " + y);
        IO.println(reduced1);

        Optional<String> reduced2 = cities.stream().reduce((x, y) -> x + ", " + y);
        reduced2.ifPresent(IO::println);

    }
}
