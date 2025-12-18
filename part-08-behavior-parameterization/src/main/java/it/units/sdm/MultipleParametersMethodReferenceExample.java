package it.units.sdm;

public class MultipleParametersMethodReferenceExample {

    static void main() {
        IntBiFunction<String, Character> b1 = (s, c) -> s.indexOf(c);
        IntBiFunction<String, Character> b2 = String::indexOf;

        IO.println(b1.apply("Software Development Methods", 't'));
        IO.println(b2.apply("Java is great!", 't'));
    }

    interface IntBiFunction<T, U> {
        int apply(T t, U u);
    }

}
