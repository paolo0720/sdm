package it.units.sdm;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static it.units.sdm.Menu.MENU;

public class CollectorsExample {

    public static void main(String[] args) {
        List<String> dishNames1 = MENU.stream()
                .map(Dish::name)
                .collect(Collectors.toList());
        System.out.println(dishNames1);

        List<String> dishNames2 = MENU.stream()
                .map(Dish::name)
                .collect(Collectors.toUnmodifiableList());
        System.out.println(dishNames2);

        Map<String, Dish> nameDishMap = MENU.stream()
                .collect(Collectors.toMap(Dish::name, Function.identity()));
        System.out.println(nameDishMap);

        List<String> dishNames3 = MENU.stream()
                .map(Dish::name)
                .toList();
        System.out.println(dishNames3);

        String[] dishNames4 = MENU.stream()
                .map(Dish::name)
                .toArray(i -> new String[i]);
        System.out.println(Arrays.toString(dishNames4));


    }
}
