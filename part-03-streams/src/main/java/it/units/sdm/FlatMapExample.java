package it.units.sdm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapExample {

    static void main() {
        Stream.of(Stream.of(1, 2), Stream.of(3, 4))
                .flatMap(x -> x)
                .forEachOrdered(IO::println);

        Stream.of(List.of(1, 2), List.of(3, 4))
                .flatMap(x -> x.stream())
                .forEachOrdered(IO::println);

        List<String> strings = List.of("Java", "is", "great!");
        List<String> distinct = strings.stream()
                .map(s -> s.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .toList();
        IO.println(distinct);
    }
}
