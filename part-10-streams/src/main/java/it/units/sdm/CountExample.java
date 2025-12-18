package it.units.sdm;

import java.util.stream.Stream;

public class CountExample {

    static void main() {
        long count = Stream.of(1, 2, 3, 4)
                .filter(n -> n % 2 == 0)
                .count();

        IO.println(count);
    }
}
