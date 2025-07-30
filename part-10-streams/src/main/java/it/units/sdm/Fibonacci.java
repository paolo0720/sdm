package it.units.sdm;

import java.util.stream.Stream;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("Generate first ten Fibonacci numbers");
        Stream.iterate(new int[]{0, 1}, a -> new int[]{a[1], a[0] + a[1]})
                .limit(10)
                .map(a -> a[0])
                .forEach(System.out::println);

        System.out.println("Fibonacci numbers smaller than 100");
        Stream.iterate(new int[] {0, 1}, a -> new int[] { a[1], a[0]+ a[1]})
                .map(a -> a[0])
                .takeWhile(a -> a < 100)
                .forEach(System.out::println);

        System.out.println("Again Fibonacci numbers smaller than 100");
        Stream.iterate(new int[] {0, 1}, a -> a[0] < 100, a -> new int[] { a[1], a[0]+ a[1]})
                .map(a -> a[0])
                .forEach(System.out::println);

    }
}
