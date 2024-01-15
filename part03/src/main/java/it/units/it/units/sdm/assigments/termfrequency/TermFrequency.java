package it.units.it.units.sdm.assigments.termfrequency;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TermFrequency {

    private final Map<String, Integer> map;

    public TermFrequency(Map<String, Integer> map) {
        this.map = new TreeMap<>(map);
    }

    private void print(Map<String, Integer> map) {
        for (var entry : map.entrySet()) {
            System.out.println(entry);
        }
    }

    public void printAlphabetically() {
        print(map);
    }

    public void printByFrequency() {
        Comparator<String> c = new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                int f1 = map.get(o1);
                int f2 = map.get(o2);
                return f1 == f2 ? o1.compareTo(o2) : f1-f2;
            }
        };
        Map<String, Integer> treeMap = new TreeMap<>(c);
        treeMap.putAll(map);
        print(treeMap);
    }
}
