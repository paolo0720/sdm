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

    static void main() {
        ListSupplier s1 = () -> new ArrayList();
        ListSupplier s2 = ArrayList::new;

        IO.println(s1.get());
        IO.println(s2.get());

        ListSupplier2 s3 = c -> new ArrayList(c);
        ListSupplier2 s4 = ArrayList::new;

        IO.println(s3.get(25));
        IO.println(s4.get(25));
    }
}
