package it.units.sdm;

import java.util.List;

import static it.units.sdm.Menu.MENU;

public class MapExample {

    static void main() {
        List<String> dishNames = MENU.stream()
                .map(Dish::name)
                .toList();

        IO.println("Dish names: " + dishNames);

        List<String> upperCaseDishNames = MENU.stream()
                .map(Dish::name)
                .map(String::toUpperCase)
                .toList();

        IO.println("Uppercase dish names: " + upperCaseDishNames);

        List<Integer> dishNameLengths = MENU.stream()
                .map(Dish::name)
                .map(String::length)
                .toList();

        IO.println("Dish name lengths: " + dishNameLengths);

    }
}
