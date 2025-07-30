package it.units.sdm;

import java.util.List;

public class FilterExample {

    public static void main(String[] args) {
        List<Dish> vegetarianMenu = Menu.MENU.stream()
                .filter(Dish::vegetarian)
                .toList();

        System.out.println(vegetarianMenu);
    }
}
