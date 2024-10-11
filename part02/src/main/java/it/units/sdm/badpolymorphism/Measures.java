package it.units.sdm.badpolymorphism;

public class Measures {

    public static double perimeter(Polygon polygon) {
        if (polygon instanceof Square) {
            Square square = (Square) polygon;
            return 4 * square.getSide();
        } else if (polygon instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) polygon;
            return 2 * (rectangle.getHeight() + rectangle.getWidth());
        } else {
            double perimeter = 0;
            for (int i = 0; i < polygon.getVertexes().length - 1; i++) {
                Point a = polygon.getVertexes()[i];
                Point b = polygon.getVertexes()[i + 1];
                perimeter += Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
            }
            return perimeter;
        }
    }

    public static void main(String[] args) {
        Polygon[] polygons = new Polygon[]{
                new Square(new Point(3, 4), 5),
                new Polygon(new Point[]{new Point(1, 1), new Point(2, 2), new Point(3, 1)}),
                new Rectangle(new Point(0, 0), 10, 1)
        };

        for (Polygon polygon : polygons) {
            System.out.println(Measures.perimeter(polygon));
        }
    }
}
