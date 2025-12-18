package it.units.sdm;

import java.util.List;

import static it.units.sdm.Menu.SPECIAL_MENU;

public class TakeWhileExample {

    static void main() {
        List<Dish> filteredMenu = SPECIAL_MENU.stream()
                .takeWhile(dish -> dish.calories() < 320)
                .toList();

        IO.println(filteredMenu);
    }
}
