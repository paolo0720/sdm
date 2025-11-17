package it.units.sdm;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class IteratorExample {

    public static void main(String[] args) {
        var set = Set.of(1, 2, 3, 4, 5);

        ArrayList<Integer> l = new ArrayList(set);
        l.addAll(List.of(1,2, 3, 4, 5));


       for (Iterator<Integer> it = l.iterator(); it.hasNext();) {
            Integer item = it.next();
            if (Integer.valueOf(3).equals(item)) {
                it.remove();
            }
        }

    }
}
