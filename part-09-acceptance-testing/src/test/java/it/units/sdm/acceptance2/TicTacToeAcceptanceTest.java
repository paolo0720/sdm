package it.units.sdm.acceptance2;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static it.units.sdm.acceptance2.Position.CENTER;
import static it.units.sdm.acceptance2.Position.E;
import static it.units.sdm.acceptance2.Position.N;
import static it.units.sdm.acceptance2.Position.NE;
import static it.units.sdm.acceptance2.Position.NW;
import static it.units.sdm.acceptance2.Position.SE;
import static it.units.sdm.acceptance2.Position.SW;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TicTacToeAcceptanceTest {

    private ViewSpy view;
    private TicTacToeGame game;

    @Test
    void testXWins() {
        startGame().verifyWindowOpened().emptyGridDisplayed().verifyMessage("Player X is your turn");
        playerPlaces(NW).verifyDisplayGrid(Map.of(NW, 'X')).verifyMessage("Player O is your turn");
        playerPlaces(CENTER).verifyDisplayGrid(Map.of(NW, 'X', CENTER, 'O')).verifyMessage("Player X is your turn");
        playerPlaces(SE).verifyDisplayGrid(Map.of(NW, 'X', CENTER, 'O', SE, 'X')).verifyMessage("Player O is your turn");
        playerPlaces(SW).verifyDisplayGrid(Map.of(NW, 'X', CENTER, 'O', SE, 'X', SW, 'O')).verifyMessage("Player X is your turn");
        playerPlaces(NE).verifyDisplayGrid(Map.of(NW, 'X', CENTER, 'O', SE, 'X', SW, 'O', NE, 'X')).verifyMessage("Player O is your turn");
        playerPlaces(E).verifyDisplayGrid(Map.of(NW, 'X', CENTER, 'O', SE, 'X', SW, 'O', NE, 'X', E, 'O')).verifyMessage("Player X is your turn");
        playerPlaces(N).verifyDisplayGrid(Map.of(NW, 'X', CENTER, 'O', SE, 'X', SW, 'O', NE, 'X', E, 'O', N, 'X')).verifyMessage("Player X won").verifyStrike(NW, NE);
        closeGame().verifyWindowClosed();
    }

    private void verifyWindowClosed() {
        assertTrue(view.closed);
    }

    private void verifyStrike(Position start, Position end) {
        assertEquals(view.strikeStart, start);
        assertEquals(view.strikeEnd, end);
    }

    private TicTacToeAcceptanceTest verifyDisplayGrid(Map<Position, Character> grid) {
        assertEquals(grid, view.displayedGrid);
        return this;
    }

    private TicTacToeAcceptanceTest playerPlaces(Position position) {
        game.playerPlaces(position);
        return this;
    }

    private TicTacToeAcceptanceTest verifyMessage(String message) {
        assertEquals(message, view.message);
        return this;
    }

    private TicTacToeAcceptanceTest emptyGridDisplayed() {
        assertEquals(Map.of(), view.displayedGrid, "Grid expected to be empty");
        return this;
    }

    private TicTacToeAcceptanceTest verifyWindowOpened() {
        assertTrue(view.shown, "Windows expected to be shown");
        return this;
    }

    private TicTacToeAcceptanceTest startGame() {
        view = new ViewSpy();
        game = new TicTacToeGame(view);
        game.start();
        return this;
    }

    private TicTacToeAcceptanceTest closeGame() {
        game.close();
        return this;
    }


    public static class ViewSpy implements TicTacToeView {

        private boolean shown;
        private String message;
        private Position strikeStart;
        private Position strikeEnd;
        private boolean closed;
        private Map<Position, Character> displayedGrid;

        @Override
        public void show() {
            shown = true;
        }

        @Override
        public void displayMessage(String message) {
            this.message = message;
        }

        @Override
        public void setStrike(Position start, Position end) {
            strikeStart = start;
            strikeEnd = end;
        }

        @Override
        public void close() {
            closed = true;
        }

        @Override
        public void setGrid(Map<Position, Character> map) {
            displayedGrid = map;
        }
    }

}
