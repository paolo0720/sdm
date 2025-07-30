package it.units.sdm;

import java.util.ArrayList;
import java.util.List;

public class ConstructorReferenceAmbiguityExample {

    interface ListSupplier {
        List get();
    }

    interface ListSupplier2 {
        List get(int capacity);
    }

    public static void main(String[] args) {
        ListSupplier s1 = () -> new ArrayList();
        ListSupplier s2 = ArrayList::new;

        System.out.println(s1.get());
        System.out.println(s2.get());

        ListSupplier2 s3 = c -> new ArrayList(c);
        ListSupplier2 s4 = ArrayList::new;

        System.out.println(s3.get(25));
        System.out.println(s4.get(25));
    }
}
