package it.units.sdm;

import java.util.List;

public class FilterExample {

    static void main() {
        List<Dish> vegetarianMenu = Menu.MENU.stream()
                .filter(Dish::vegetarian)
                .toList();

        IO.println(vegetarianMenu);
    }
}
