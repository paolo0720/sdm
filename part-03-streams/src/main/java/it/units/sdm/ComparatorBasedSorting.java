package it.units.sdm;

import java.util.Comparator;

import static it.units.sdm.Menu.MENU;

public class ComparatorBasedSorting {
    static void main() {
        MENU.stream()
                .sorted(Comparator.comparing(Dish::calories))
                .forEach(IO::println);
    }
}
