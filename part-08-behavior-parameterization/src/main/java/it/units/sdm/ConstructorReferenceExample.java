package it.units.sdm;

import java.util.ArrayList;
import java.util.List;

public class ConstructorReferenceExample {

    public static void main(String[] args) {
        ListSupplier s1 = () -> new ArrayList();
        ListSupplier s2 = ArrayList::new;

        System.out.println(s1.get());
        System.out.println(s2.get());
    }

    interface ListSupplier {
        List get();
    }
}
