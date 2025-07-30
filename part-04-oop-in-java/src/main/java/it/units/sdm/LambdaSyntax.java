package it.units.sdm;

public class LambdaSyntax {

    public interface DoubleAdder {
        double add(Double a, Double b);
    }

    public interface IntegerAdder {
        int add(Integer a, Integer b);
    }

    public interface StringAdder {
        String add(String a, String b);
    }

    public static void main(String[] args) {
        IntegerAdder integerAdder = (x, y) -> x + y;
        DoubleAdder doubleAdder = (x, y) -> x + y;
        StringAdder stringAdder = (x, y) -> x + y;

        System.out.println(integerAdder.add(2, 3));
        System.out.println(doubleAdder.add(3.14, 3.0));
        System.out.println(stringAdder.add("Hello, ", "World!"));
    }
}
