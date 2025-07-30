package it.units.sdm;

import static it.units.sdm.Menu.MENU;

public class ReductionExample2 {

    public static void main(String[] args) {
        Integer sumOfCalories = MENU.stream()
                .map(Dish::calories)
                .reduce(0, Integer::sum);

        System.out.println("Sum of the calories in the menu: " + sumOfCalories);
    }
}
