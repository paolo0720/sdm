package it.units.sdm;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StringConcatenationByReductionExample {

    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Trieste", "Gorizia", "Udine", "Pordenone");

        String reduced1 = cities.stream().reduce("", (x, y) -> x + ", " + y);
        System.out.println(reduced1);

        Optional<String> reduced2 = cities.stream().reduce((x, y) -> x + ", " + y);
        reduced2.ifPresent(System.out::println);

    }
}
