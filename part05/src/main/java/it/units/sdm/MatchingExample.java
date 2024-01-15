package it.units.sdm;

import it.units.sdm.Dish.Type;

import static it.units.sdm.Menu.MENU;

public class MatchingExample {

    public static void main(String[] args) {
        boolean atLeastOneVegetarian = MENU.stream()
                .anyMatch(Dish::vegetarian);
        System.out.println("Is there at least one vegetarian dish? " + atLeastOneVegetarian);

        boolean vegetarianOnly = MENU.stream()
                .allMatch(Dish::vegetarian);
        System.out.println("Is the menu vegetarian only? " + vegetarianOnly);

        boolean noMeatNorFish = MENU.stream()
                .noneMatch(d -> d.type() == Type.MEAT || d.type() == Type.FISH);
        System.out.println("Is the menu fish and meat free? " + noMeatNorFish);

    }
}
