package it.units.sdm.betterpolymorphism;

public class Polygon {

    private final Point[] vertexes;

    public Polygon(Point[] vertexes) {
        this.vertexes = vertexes;
    }

    public double perimeter() {
        double perimeter = 0;
        for (int i = 0; i < vertexes.length - 1; i++) {
            Point a = vertexes[i];
            Point b = vertexes[i + 1];
            perimeter += Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
        }
        return perimeter;
    }
}

