package it.units.sdm;

import java.util.stream.Stream;

public class ForEachExample {

    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

    }
}
