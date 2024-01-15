package it.units.sdm;

import java.util.Optional;

import static it.units.sdm.Menu.MENU;

public class FindingExample {

    public static void main(String[] args) {
        Optional<Dish> aVegDish = MENU.stream()
                .filter(Dish::vegetarian)
                .findAny();

        aVegDish.ifPresent(d -> System.out.println("A vegetarian dish: " + d.name()));

        Optional<Dish> firstVegDish = MENU.stream()
                .filter(Dish::vegetarian)
                .findFirst();

        firstVegDish.ifPresent(d -> System.out.println("First vegetarian dish: " + d.name()));

        Optional<Dish> vegMeat = MENU.stream()
                .filter(Dish::vegetarian)
                .filter(d -> d.type() == Dish.Type.MEAT)
                .findAny();

        vegMeat.ifPresentOrElse(d -> System.out.println("A vegetarian meat dish: " + d.name()), () -> System.out.println("No vegetarian meat dish in this menu"));
    }
}
