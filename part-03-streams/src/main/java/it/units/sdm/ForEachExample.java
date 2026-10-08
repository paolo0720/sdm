package it.units.sdm;

import java.util.stream.Stream;

public class ForEachExample {

    static void main() {
        Stream.of(1, 2, 3, 4)
                .filter(n -> n % 2 == 0)
                .forEach(IO::println);

    }
}
