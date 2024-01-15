package it.units.sdm;

import java.util.stream.Stream;

public class CountExample {

    public static void main(String[] args) {
        long count = Stream.of(1, 2, 3, 4)
                .filter(n -> n % 2 == 0)
                .count();

        System.out.println(count);
    }
}
