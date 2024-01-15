package it.units.it.units.sdm;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorExample1 {

    public static void main(String[] args) {
        Set<String> citiesOfFvg = Set.of("Trieste", "Udine", "Gorizia", "Pordenone");

        Set<String> lengthOrder = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        lengthOrder.addAll(citiesOfFvg);

        System.out.println(lengthOrder);
    }
}
