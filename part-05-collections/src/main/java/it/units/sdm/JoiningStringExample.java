package it.units.sdm;

import java.util.Arrays;
import java.util.stream.Collectors;

import static it.units.sdm.Menu.MENU;

public class JoiningStringExample {

    public static void main(String[] args) {
        String result = MENU.stream()
                .map(Dish::name)
                .map(name -> name.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }
}
