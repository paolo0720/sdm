package it.units.sdm;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingExample {

    public static void main(String[] args) {
        Map<Dish.Type, List<Dish>> dishesByType = Menu.MENU.stream()
                .collect(Collectors.groupingBy(Dish::type));

        System.out.println(dishesByType);
    }
}
