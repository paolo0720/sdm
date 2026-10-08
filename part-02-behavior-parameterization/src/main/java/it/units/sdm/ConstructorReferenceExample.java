package it.units.sdm;

import java.util.ArrayList;
import java.util.List;

public class ConstructorReferenceExample {

    static void main() {
        ListSupplier s1 = () -> new ArrayList();
        ListSupplier s2 = ArrayList::new;

        IO.println(s1.get());
        IO.println(s2.get());
    }

    interface ListSupplier {
        List get();
    }
}
