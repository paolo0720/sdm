package it.units.sdm;

public class MethodReferenceExample {

    static void main() {
        IntFunction<String> f1 = x -> x.length();
        IntFunction<String> f2 = String::length;

        IO.println(f1.apply("Software Development Method"));
        IO.println(f2.apply("Java is great!"));
    }

    interface IntFunction<T> {
        int apply(T t);
    }
}
