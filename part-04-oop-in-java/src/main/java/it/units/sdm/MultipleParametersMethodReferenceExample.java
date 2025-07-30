package it.units.sdm;

public class MultipleParametersMethodReferenceExample {

    public static void main(String[] args) {
        IntBiFunction<String, Character> b1 = (s, c) -> s.indexOf(c);
        IntBiFunction<String, Character> b2 = String::indexOf;

        System.out.println(b1.apply("Software Development Methods", 't'));
        System.out.println(b2.apply("Java is great!", 't'));
    }

    interface IntBiFunction<T, U> {
        int apply(T t, U u);
    }

}
