package it.units.sdm;

import java.util.Arrays;
import java.util.stream.Collectors;

import static it.units.sdm.Menu.MENU;

public class JoiningStringExample {

    static void main() {
        String result = MENU.stream()
                .map(Dish::name)
                .map(name -> name.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.joining(", "));

        IO.println(result);
    }
}
