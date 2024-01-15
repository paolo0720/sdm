package it.units.sdm;

import java.util.List;

import static it.units.sdm.Menu.SPECIAL_MENU;

public class LimitExample {

    public static void main(String[] args) {
        List<Dish> filteredMenu = SPECIAL_MENU.stream()
                .filter(dish -> dish.calories() < 500)
                .limit(3)
                .toList();

        System.out.println(filteredMenu);

    }
}
