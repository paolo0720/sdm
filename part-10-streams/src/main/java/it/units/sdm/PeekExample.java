package it.units.sdm;

import java.util.Optional;
import java.util.stream.Stream;

public class PeekExample {

    static void main() {
        Optional<Integer> value = Stream.of(1, 2, 3, 4)
                .peek(x -> IO.println("processing: " + x))
                .filter(n -> n % 2 == 0)
                .peek(y -> IO.println("accepted " + y))
                .findFirst();

    }
}
