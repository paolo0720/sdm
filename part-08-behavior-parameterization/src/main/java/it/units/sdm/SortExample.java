package it.units.sdm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortExample {

    static void main() {
        List<String> list = new ArrayList<>();
        list.add("Trieste");
        list.add("Muggia");
        list.add("Duino-Aurisina");
        list.add("Sgonico");
        list.add("Monrupino");
        list.add("San Dorligo della Valle");

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        IO.println(list);
    }

}
