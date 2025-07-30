package it.units.sdm.betterpolymorphism;

public class Square extends Rectangle {

    private final double side;

    public Square(Point origin, double side) {
        super(origin, side, side);
        this.side = side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }
}
