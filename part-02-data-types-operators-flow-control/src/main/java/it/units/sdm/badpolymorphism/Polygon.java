package it.units.sdm.badpolymorphism;

public class Polygon {

    private final Point[] vertexes;

    public Polygon(Point[] vertexes) {
        this.vertexes = vertexes;
    }

    public Point[] getVertexes() {
        return vertexes;
    }
}

