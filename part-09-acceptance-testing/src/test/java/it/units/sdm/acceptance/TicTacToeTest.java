package it.units.sdm.acceptance;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static it.units.sdm.acceptance.Position.CENTER;
import static it.units.sdm.acceptance.Position.EAST;
import static it.units.sdm.acceptance.Position.NE;
import static it.units.sdm.acceptance.Position.NORTH;
import static it.units.sdm.acceptance.Position.NW;
import static it.units.sdm.acceptance.Position.SE;
import static it.units.sdm.acceptance.Position.SW;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TicTacToeTest implements TicTacToeView {

    private TicTacToe ticTacToe;
    private boolean shown;
    private boolean closed;
    private String message;
    private Map grid;
    private Position strikeStart;
    private Position strikeEnd;

    @Test
    void xPlayerWins() {
        startGame().verifyWindowOpened().verifyDisplayEmptyGrid().verifyDisplay("Player X is your turn");
        playerXPlaces(NW).verifyDidsplayGrid(Map.of(NW, "X")).verifyDisplay("Player O is your turn");
        playerOPlaces(CENTER).verifyDidsplayGrid(Map.of(NW, "X", CENTER, "O")).verifyDisplay("Player X is your turn");
        playerXPlaces(SE).verifyDidsplayGrid(Map.of(NW, "X", CENTER, "O", SE, "X")).verifyDisplay("Player O is your turn");
        playerOPlaces(SW).verifyDidsplayGrid(Map.of(NW, "X", CENTER, "O", SE, "X", SW, "O")).verifyDisplay("Player X is your turn");
        playerXPlaces(NE).verifyDidsplayGrid(Map.of(NW, "X", CENTER, "O", SE, "X", SW, "O", NE, "X")).verifyDisplay("Player O is your turn");
        playerOPlaces(EAST).verifyDidsplayGrid(Map.of(NW, "X", CENTER, "O", SE, "X", SW, "O", NE, "X", EAST, "O")).verifyDisplay("Player X is your turn");
        playerXPlaces(NORTH).verifyDidsplayGrid(Map.of(NW, "X", CENTER, "O", SE, "X", SW, "O", NE, "X", EAST, "O", NORTH, "X")).verifyStrike(NW, NE).verifyDisplay("Player X won");
        closeGame().verifyWindowClosed();
    }

    private void verifyWindowClosed() {
        assertTrue(closed);
    }

    private TicTacToeTest verifyStrike(Position start, Position end) {
        assertEquals(start, this.strikeStart);
        assertEquals(end, this.strikeEnd);
        return this;
    }

    private TicTacToeTest verifyDidsplayGrid(Map<Position, String> grid) {
        assertEquals(grid, this.grid);
        return this;
    }

    private void verifyDisplay(String message) {
        assertEquals(message, this.message);
    }


    private TicTacToeTest verifyDisplayEmptyGrid() {
        assertTrue(grid.isEmpty());
        return this;
    }

    private TicTacToeTest verifyWindowOpened() {
        assertTrue(shown);
        return this;
    }

    private TicTacToeTest startGame() {
        ticTacToe = new TicTacToe(this);
        ticTacToe.start();
        return this;
    }

    private TicTacToeTest closeGame() {
        ticTacToe.close();
        return this;
    }

    private TicTacToeTest playerXPlaces(Position position) {
        ticTacToe.xPlaces(position);
        return this;
    }

    private TicTacToeTest playerOPlaces(Position position) {
        ticTacToe.oPlaces(position);
        return this;
    }

    @Override
    public void show() {
        shown = true;
    }

    @Override
    public void close() {
        closed = true;
    }

    @Override
    public void displayMessage(String message) {
        this.message = message;
    }

    @Override
    public void displayGrid(Map grid) {
        this.grid = grid;
    }

    @Override
    public void strike(Position start, Position end) {
        strikeStart = start;
        strikeEnd = end;
    }
}
