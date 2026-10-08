package it.units.sdm.acceptance;

import java.util.HashMap;
import java.util.Map;

import static it.units.sdm.acceptance.Position.NE;
import static it.units.sdm.acceptance.Position.NORTH;
import static it.units.sdm.acceptance.Position.NW;

public class TicTacToe {

    private final TicTacToeView view;
    private final Map grid = new HashMap();

    public TicTacToe(TicTacToeView view) {
        this.view = view;
    }

    public void start() {
        view.show();
        view.displayGrid(Map.of());
        view.displayMessage("Player X is your turn");
    }

    public void xPlaces(Position position) {
        grid.put(position, "X");
        view.displayGrid(grid);
        if ("X".equals(grid.get(NW)) && "X".equals(grid.get(NORTH)) && "X".equals(grid.get(NE))) {
            view.strike(NW, NE);
            view.displayMessage("Player X won");
        } else {
            view.displayMessage("Player O is your turn");
        }
    }

    public void oPlaces(Position position) {
        grid.put(position, "O");
        view.displayGrid(grid);
        view.displayMessage("Player X is your turn");
    }

    public void close() {
        view.close();
    }
}
