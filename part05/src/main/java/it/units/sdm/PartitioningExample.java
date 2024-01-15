package it.units.sdm;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static it.units.sdm.Menu.MENU;

public class PartitioningExample {

    public static void main(String[] args) {
        Map<Boolean, List<Dish>> partitionedMenu = MENU.stream()
                .collect(Collectors.partitioningBy(Dish::vegetarian));

        System.out.println(partitionedMenu);
    }
}
