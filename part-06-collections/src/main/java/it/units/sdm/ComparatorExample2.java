package it.units.sdm;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorExample2 {

    static void main(String[] args) {
        Comparator<String> comparator = new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };

        Set<String> triesteOnly = new TreeSet<>(comparator);
        triesteOnly.add("Trieste");
        System.out.println(triesteOnly.contains("Gorizia"));
    }
}
