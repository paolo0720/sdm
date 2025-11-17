package it.units.sdm;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetEquivalence {

    static void main() {
        List<String> fvgCities = List.of("Udine", "Trieste", "Gorizia", "Pordenone");
        Set<String> hashSet = new HashSet<>(fvgCities);
        Set<String> treeSet = new TreeSet<>(fvgCities);

        IO.println(hashSet); // [Trieste, Udine, Gorizia, Pordenone]
        IO.println(treeSet); // [Gorizia, Pordenone, Trieste, Udine]
        IO.println(hashSet.equals(treeSet)); //true
    }
}
