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

    static void main() {
        IntegerAdder integerAdder = (x, y) -> x + y;
        DoubleAdder doubleAdder = (x, y) -> x + y;
        StringAdder stringAdder = (x, y) -> x + y;

        IO.println(integerAdder.add(2, 3));
        IO.println(doubleAdder.add(3.14, 3.0));
        IO.println(stringAdder.add("Hello, ", "World!"));
    }
}
