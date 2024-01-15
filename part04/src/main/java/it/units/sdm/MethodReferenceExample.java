package it.units.sdm;

public class MethodReferenceExample {

    public static void main(String[] args) {
        IntFunction<String> f1 = x -> x.length();
        IntFunction<String> f2 = String::length;

        System.out.println(f1.apply("Software Development Method"));
        System.out.println(f2.apply("Java is great!"));
    }

    interface IntFunction<T> {
        int apply(T t);
    }
}
