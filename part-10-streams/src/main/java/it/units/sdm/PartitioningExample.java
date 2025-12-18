package it.units.sdm;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static it.units.sdm.Menu.MENU;

public class PartitioningExample {

    static void main() {
        Map<Boolean, List<Dish>> partitionedMenu = MENU.stream()
                .collect(Collectors.partitioningBy(Dish::vegetarian));

        IO.println(partitionedMenu);
    }
}
