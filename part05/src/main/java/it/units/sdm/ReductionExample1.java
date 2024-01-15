package it.units.sdm;

import java.util.Optional;

import static it.units.sdm.Menu.MENU;

public class ReductionExample1 {

    public static void main(String[] args) {
        Optional<Integer> highestCaloriesOptional = MENU.stream()
                .map(Dish::calories)
                .reduce((a, b) ->  a > b ? a : b);
        System.out.println("Highest calories in the menu: " + highestCaloriesOptional);

        Optional<Dish> highestCaloriesOptionalDish = MENU.stream()
                .reduce((a, b) ->  a.calories() > b.calories() ? a : b);
        System.out.println("Highest calories dish in the menu: " + highestCaloriesOptionalDish);

        Optional<Integer> optionalSumOfCalories = MENU.stream()
                .map(Dish::calories)
                .reduce((a, b) -> a + b);
        System.out.println("Sum of the calories in the menu: " + optionalSumOfCalories);

    }
}
