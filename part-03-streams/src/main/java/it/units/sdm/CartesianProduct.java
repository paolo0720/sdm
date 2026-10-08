package it.units.sdm;

import java.util.List;
import java.util.function.Function;

public class CartesianProduct {

    static void main() {
        List<Integer> list1 = List.of(1, 2, 3);
        List<Integer> list2 = List.of(3, 4);

        IO.println(list1.stream()
                .map(i1 -> list2.stream().map(i2 -> List.of(i1, i2)))
                .flatMap(Function.identity())
                .toList());


        IO.println(list1.stream()
                .flatMap(i1 -> list2.stream().map(i2 -> List.of(i1, i2)))
                .toList());

    }
}
