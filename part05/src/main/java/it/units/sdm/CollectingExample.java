package it.units.sdm;

import java.util.ArrayList;
import java.util.List;

import static it.units.sdm.Menu.MENU;

public class CollectingExample {

    public static void main(String[] args) {
        List<String> dishNames1 = MENU.stream()
                .collect(() -> new ArrayList<>(), (a, d) -> a.add(d.name()), (a, d) -> a.addAll(d));
        System.out.println(dishNames1);

        List<String> dishNames2 = MENU.stream()
                .map(Dish::name)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        System.out.println(dishNames2);
    }
}
