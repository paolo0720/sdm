package it.units.sdm.betterpolymorphism;

public class Measures {

    public static void main(String[] args) {
        Polygon[] polygons = new Polygon[]{
                new Square(new Point(3, 4), 5),
                new Polygon(new Point[]{new Point(1, 1), new Point(2, 2), new Point(3, 1)}),
                new Rectangle(new Point(0, 0), 10, 1)
        };

        for (Polygon polygon : polygons) {
            System.out.println(polygon.perimeter());
        }
    }
}
