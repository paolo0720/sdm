package it.units.sdm;

import java.util.Optional;
import java.util.stream.Stream;

public class PeekExample {

    public static void main(String[] args) {
        Optional<Integer> value = Stream.of(1, 2, 3, 4)
                .peek(x -> System.out.println("processing: " + x))
                .filter(n -> n % 2 == 0)
                .peek(y -> System.out.println("accepted " + y))
                .findFirst();

    }
}
