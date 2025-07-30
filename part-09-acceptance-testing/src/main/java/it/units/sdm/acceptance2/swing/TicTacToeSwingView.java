package it.units.sdm.acceptance2.swing;

import it.units.sdm.acceptance2.Position;
import it.units.sdm.acceptance2.TicTacToeGame;
import it.units.sdm.acceptance2.TicTacToeView;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import java.util.Map;

public class TicTacToeSwingView implements TicTacToeView {

    private JPanel pane;
    private JFrame frame;
    private Grid grid;
    private Position strikeStart;
    private Position strikeEnd;
    private JLabel messageLabel;

    public TicTacToeSwingView() {
        createComponents();
    }

    private void createComponents() {
        messageLabel = new JLabel();
        messageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        grid = new Grid();
        pane = new JPanel(new BorderLayout());
        pane.add(messageLabel, BorderLayout.NORTH);
        pane.add(grid, BorderLayout.CENTER);
    }

    @Override
    public void show() {
        SwingUtilities.invokeLater(() -> {
            frame = new JFrame("Tic-tac-toe");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setContentPane(pane);
            frame.pack();
            frame.setVisible(true);
        });
    }

    @Override
    public void displayMessage(String message) {
        SwingUtilities.invokeLater(() -> messageLabel.setText(message));
    }

    @Override
    public void setGrid(Map<Position, Character> map) {
        SwingUtilities.invokeLater(() -> grid.setMarks(map));
    }

    @Override
    public void setStrike(Position start, Position end) {
        SwingUtilities.invokeLater(() -> grid.setStrike(start, end));
    }

    @Override
    public void close() {
        SwingUtilities.invokeLater(() -> frame.dispose());
    }

    private void setTicTacToeGame(TicTacToeGame game) {
        grid.setGame(game);
    }

    public static void main(String[] args) {
        TicTacToeSwingView view = new TicTacToeSwingView();
        TicTacToeGame game = new TicTacToeGame(view);
        view.setTicTacToeGame(game);
        game.start();
    }

}
