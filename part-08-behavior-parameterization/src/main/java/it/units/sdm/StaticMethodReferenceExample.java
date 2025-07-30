package it.units.sdm;

public class StaticMethodReferenceExample {

    public static void main(String[] args) {
        LongSupplier s1 = () -> System.currentTimeMillis();
        LongSupplier s2 = System::currentTimeMillis;

        System.out.println(s1.get());
        System.out.println(s2.get());
    }

    interface LongSupplier {
        long get();
    }
}
