package it.units.sdm;

import java.util.Arrays;
import java.util.List;

public class DistinctExample {

    static void main() {
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        numbers.stream()
                .filter(i -> i % 2 == 0)
                .distinct()
                .forEach(IO::println);
    }
}
