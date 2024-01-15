package it.units.sdm;

import java.util.List;

import static it.units.sdm.Menu.MENU;

public class MapExample {

    public static void main(String[] args) {
        List<String> dishNames = MENU.stream()
                .map(Dish::name)
                .toList();

        System.out.println("Dish names: " + dishNames);

        List<String> upperCaseDishNames = MENU.stream()
                .map(Dish::name)
                .map(String::toUpperCase)
                .toList();

        System.out.println("Uppercase dish names: " + upperCaseDishNames);

        List<Integer> dishNameLengths = MENU.stream()
                .map(Dish::name)
                .map(String::length)
                .toList();

        System.out.println("Dish name lengths: " + dishNameLengths);

    }
}
