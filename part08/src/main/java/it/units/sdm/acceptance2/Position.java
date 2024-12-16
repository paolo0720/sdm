package it.units.sdm.acceptance2;

import java.util.Arrays;
import java.util.Optional;

public enum Position {

    NW(0, 0), N(1, 0), NE(2, 0), W(0, 1), CENTER(1, 1), E(2, 1), SW(0, 2), S(1, 2), SE(2, 2);

    private final int x, y;

    Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Optional<Position> getPosition(int x, int y) {
        return Arrays.stream(Position.values()).filter(p -> p.x == x && p.y == y).findAny();
    }

    public int x() {
        return x;
    }

    public int y() {
        return y;
    }
}
