package it.units.sdm;

import java.util.Comparator;

import static it.units.sdm.Menu.MENU;

public class ComparatorBasedSorting {
    public static void main(String[] args) {
        MENU.stream()
                .sorted(Comparator.comparing(Dish::calories))
                .forEach(System.out::println);
    }
}
