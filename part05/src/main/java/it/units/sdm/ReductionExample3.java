package it.units.sdm;

import java.util.List;
import java.util.stream.Collectors;

import static it.units.sdm.Menu.MENU;

public class ReductionExample3 {

    public static void main(String[] args) {
        Integer sumOfCalories = MENU.stream()
                .reduce(0, (a, c) -> a + c.calories(), Integer::sum);

        System.out.println("Sum of the calories in the menu: " + sumOfCalories);
    }
}
