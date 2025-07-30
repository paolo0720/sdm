package it.units.sdm;

import it.units.sdm.Dish.Type;

import java.util.List;

public class Menu {

    static final List<Dish> MENU = List.of(
            new Dish("pork", false, 800, Type.MEAT),
            new Dish("beef", false, 700, Type.MEAT),
            new Dish("chicken", false, 400, Type.MEAT),
            new Dish("french fries", true, 530, Type.OTHER),
            new Dish("rice", true, 350, Type.OTHER),
            new Dish("season fruit", true, 120, Type.OTHER),
            new Dish("pizza", true, 550, Type.OTHER),
            new Dish("prawns", false, 300, Type.FISH),
            new Dish("salmon", false, 450, Type.FISH)
    );

    static final List<Dish> SPECIAL_MENU = List.of(
            new Dish("seasonal fruit", true, 120, Type.OTHER),
            new Dish("prawns", false, 300, Type.FISH),
            new Dish("rice", true, 350, Type.OTHER),
            new Dish("chicken", false, 400, Type.MEAT),
            new Dish("french fries", true, 530, Type.OTHER)
    );

}
