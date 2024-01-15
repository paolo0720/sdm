package it.units.it.units.sdm;

import java.util.Iterator;
import java.util.Set;

public class IteratorExample {

    public static void main(String[] args) {
        var set = Set.of(1, 2, 3, 4, 5);
        for (Iterator<Integer> it = set.iterator(); it.hasNext();) {
            Integer item = it.next();
            if (Integer.valueOf(3).equals(item)) {
                it.remove();
            }
        }
    }
}
