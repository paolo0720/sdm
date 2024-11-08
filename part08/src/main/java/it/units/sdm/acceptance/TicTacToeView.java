package it.units.sdm.acceptance;

import java.util.Map;

public interface TicTacToeView {

    void show();

    void close();

    void displayMessage(String message);

    void displayGrid(Map grid);

    void strike(Position start, Position end);

}
