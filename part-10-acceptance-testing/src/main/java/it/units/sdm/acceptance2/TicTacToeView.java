package it.units.sdm.acceptance2;

import java.util.Map;

public interface TicTacToeView {

    void show();

    void displayMessage(String message);

    void setGrid(Map<Position, Character> map);

    void setStrike(Position start, Position end);

    void close();
}
