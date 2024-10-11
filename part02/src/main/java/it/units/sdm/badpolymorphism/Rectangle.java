package it.units.sdm.badpolymorphism;

public class Rectangle extends Polygon {

    private final double width;
    private final double height;

    public Rectangle(Point origin, double width, double height) {
        super(new Point[] {
                origin,
                new Point(origin.getX()+width, origin.getY()),
                new Point(origin.getX()+width, origin.getY()+height),
                new Point(origin.getX(), origin.getY()+height)
        });

        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
