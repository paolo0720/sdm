package it.units.sdm;

import java.util.Comparator;
import java.util.List;

import static it.units.sdm.Menu.MENU;

public class DeclarativeProcessing {

    public static void main(String[] args) {

        List<String> lowCaloricDishesName = MENU.stream()
                .filter(d -> d.calories() < 400)
                .sorted(Comparator.comparing(Dish::calories))
                .map(Dish::name)
                .toList();

        System.out.println(lowCaloricDishesName);
    }
}
