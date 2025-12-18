package it.units.sdm;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingExample {

    static void main() {
        Map<Dish.Type, List<Dish>> dishesByType = Menu.MENU.stream()
                .collect(Collectors.groupingBy(Dish::type));

        IO.println(dishesByType);
    }
}
