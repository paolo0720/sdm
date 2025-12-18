package it.units.sdm;

import java.util.List;

import static it.units.sdm.Menu.SPECIAL_MENU;

public class LimitExample {

    static void main() {
        List<Dish> filteredMenu = SPECIAL_MENU.stream()
                .filter(dish -> dish.calories() < 500)
                .limit(3)
                .toList();

        IO.println(filteredMenu);

    }
}
