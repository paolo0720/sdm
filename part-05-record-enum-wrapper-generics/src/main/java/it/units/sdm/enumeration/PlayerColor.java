package it.units.sdm.enumeration;

public enum PlayerColor {

    BLACK {
        @Override
        PlayerColor getOpponent() {
            return WHITE;
        }
    }, WHITE {
        @Override
        PlayerColor getOpponent() {
            return BLACK;
        }
    };

    abstract PlayerColor getOpponent();
}
