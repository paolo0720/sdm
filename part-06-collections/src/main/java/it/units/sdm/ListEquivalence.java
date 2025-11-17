package it.units.sdm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListEquivalence {

    static void main() {
        List<String> al = new ArrayList<>();
        al.add("SDM");

        List<String> ll = new LinkedList<>();
        ll.add("SDM");

        IO.println(al.equals(ll)); // true
    }
}
