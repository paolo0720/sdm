package it.units.sdm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static it.units.sdm.Menu.MENU;

public class ImperativeProcessing {

    public static void main(String[] args) {
        List<Dish> lowCaloricDishes = new ArrayList<>();
        for (Dish dish : MENU) {
            if (dish.calories() < 400) {
                lowCaloricDishes.add(dish);
            }
        }

        lowCaloricDishes.sort(Comparator.comparingInt(Dish::calories));
        List<String> lowCaloricDishesName = new ArrayList<>();
        for (Dish dish : lowCaloricDishes) {
            lowCaloricDishesName.add(dish.name());
        }

        System.out.println(lowCaloricDishesName);
    }
}
