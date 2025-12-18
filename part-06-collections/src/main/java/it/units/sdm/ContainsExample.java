package it.units.sdm;

import java.util.ArrayList;
import java.util.List;

public class ContainsExample {

    static void main() {
        var aList = new ArrayList<>();
        var list = List.of(1, "Paolo", aList);

        IO.println(list.contains(1)); // true
        IO.println(list.contains("Paolo")); // true
        IO.println(list.contains(List.of())); // true

        aList.add("Dario");
        IO.println(list.contains(List.of())); // false
    }
}
