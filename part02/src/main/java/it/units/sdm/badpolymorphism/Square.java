package it.units.sdm.badpolymorphism;

public class Square extends Rectangle {

    private final double side;

    public Square(Point origin, double side) {
        super(origin, side, side);
        this.side = side;
    }

    public double getSide() {
        return side;
    }
}
