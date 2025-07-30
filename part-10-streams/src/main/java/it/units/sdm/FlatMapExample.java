package it.units.sdm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapExample {

    public static void main(String[] args) {
        Stream.of(Stream.of(1, 2), Stream.of(3, 4))
                .flatMap(x -> x)
                .forEachOrdered(System.out::println);

        Stream.of(List.of(1, 2), List.of(3, 4))
                .flatMap(x -> x.stream())
                .forEachOrdered(System.out::println);

        List<String> strings = List.of("Java", "is", "great!");
        List<String> distinct = strings.stream()
                .map(s -> s.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .toList();
        System.out.println(distinct);
    }
}
