package it.units.it.units.sdm;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorExample3 {
    public static void main(String[] args) {
        Set<String> citiesOfFvg = Set.of("Trieste", "Udine", "Gorizia", "Pordenone");
        Comparator<String> comparator = new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() == o2.length() ? o1.compareTo(o2) : o1.length() - o2.length();
            }
        };

        TreeSet<String> lengthOrder = new TreeSet<>(comparator);
        lengthOrder.addAll(citiesOfFvg);
        System.out.println(lengthOrder);
    }
}
