package it.units.sdm.acceptance2;


import java.util.HashMap;
import java.util.Map;

import static it.units.sdm.acceptance2.Position.N;
import static it.units.sdm.acceptance2.Position.NE;
import static it.units.sdm.acceptance2.Position.NW;

public class TicTacToeGame {

    private final TicTacToeView view;
    private final Map<Position, Character> grid;
    private Character currentPlayer;

    public TicTacToeGame(TicTacToeView view) {
        this.view = view;
        grid = new HashMap<>();
    }

    public void playerPlaces(Position position) {
        grid.put(position, currentPlayer);
        view.setGrid(grid);
        if (Character.valueOf('X').equals(grid.get(NW)) && Character.valueOf('X').equals(grid.get(N)) && Character.valueOf('X').equals(grid.get(NE))) {
            view.displayMessage("Player X won");
            view.setStrike(NW, NE);
        } else if (currentPlayer == 'X') {
            currentPlayer = 'O';
            view.displayMessage("Player O is your turn");
        } else {
            currentPlayer = 'X';
            view.displayMessage("Player X is your turn");
        }
    }

    public void start() {
        currentPlayer = 'X';
        view.show();
        view.setGrid(Map.of());
        view.displayMessage("Player X is your turn");
    }

    public void close() {
        view.close();
    }
}
