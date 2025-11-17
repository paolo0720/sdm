package it.units.sdm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListSortingExample {

    static void main() {
        List<String> list = new ArrayList<>();
        list.add("Trieste");
        list.add("Udine");
        list.add("Pordenone");
        list.add("Gorizia");

        IO.println("Original list");
        IO.println(list);

        list.sort(Comparator.naturalOrder());

        IO.println("Sorting by natural order");
        IO.println(list);

        //noinspection Convert2Lambda
        list.sort(new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        IO.println("Sorting by length");
        IO.println(list);

    }
}
