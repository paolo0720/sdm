package it.units.sdm;

import static it.units.sdm.Menu.MENU;

public class ReductionExample3 {

    static void main() {
        Integer sumOfCalories = MENU.stream()
                .reduce(0, (a, c) -> a + c.calories(), Integer::sum);

        IO.println("Sum of the calories in the menu: " + sumOfCalories);
    }
}
