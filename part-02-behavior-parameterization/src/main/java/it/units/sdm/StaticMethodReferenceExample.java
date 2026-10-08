package it.units.sdm;

public class StaticMethodReferenceExample {

    static void main() {
        LongSupplier s1 = () -> System.currentTimeMillis();
        LongSupplier s2 = System::currentTimeMillis;

        IO.println(s1.get());
        IO.println(s2.get());
    }

    interface LongSupplier {
        long get();
    }
}
