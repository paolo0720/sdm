package it.units.sdm.acceptance2.swing;

import it.units.sdm.acceptance2.Position;
import it.units.sdm.acceptance2.TicTacToeGame;

import javax.swing.JComponent;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.util.Map;

public class Grid extends JComponent {

    private TicTacToeGame game;
    private Map<Position, Character> marks;
    private Position strikeStart;
    private Position strikeEnd;

    public Grid() {
        enableEvents(MouseEvent.MOUSE_CLICKED);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(300, 300);
    }

    public void setGame(TicTacToeGame game) {
        this.game = game;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graphics = (Graphics2D) g.create();
        try {
            paintBackground(graphics);
            drawGrid(graphics);
            drawMarks(graphics);
            drawStrike(graphics);
        } finally {
            graphics.dispose();
        }
    }

    private void paintBackground(Graphics2D graphics) {
        graphics.setColor(getBackground());
        graphics.fillRect(0, 0, getWidth(), getHeight());
    }

    private void drawGrid(Graphics2D graphics) {
        int side = getSide();
        int offset = side / 2;
        graphics.setColor(Color.BLACK);
        graphics.drawLine(offset, offset + side, offset + 3 * side, offset + side);
        graphics.drawLine(offset, offset + 2 * side, offset + 3 * side, offset + 2 * side);
        graphics.drawLine(offset + side, offset, offset + side, offset + 3 * side);
        graphics.drawLine(offset + 2 * side, offset, offset + 2 * side, offset + 3 * side);
    }

    private void drawMarks(Graphics2D graphics) {
        if (marks != null) {
            int side = getSide();
            graphics.setColor(Color.BLACK);
            marks.forEach((p, c) -> {
                int markX = side * (1 + p.x());
                int markY = side * (1 + p.y());
                int markSide = 2 * side / 5;
                if (c == 'X') {
                    graphics.drawLine(markX - markSide, markY - markSide, markX + markSide, markY + markSide);
                    graphics.drawLine(markX - markSide, markY + markSide, markX + markSide, markY - markSide);
                } else {
                    graphics.drawOval(markX - markSide, markY - markSide, 2 * markSide, 2 * markSide);
                }
            });
        }
    }

    private void drawStrike(Graphics2D graphics) {
        if (strikeStart != null && strikeEnd != null) {
            graphics.setColor(Color.RED);
            graphics.setStroke(new BasicStroke(4, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
            if (horizontalStrike()) {
                drawHorizontalStrike(graphics);
            } else if (verticalStrike()) {
                drawVerticalStrike(graphics);
            } else {
                drawDiagonalStrike(graphics);
            }
        }
    }

    private void drawHorizontalStrike(Graphics2D graphics) {
        int side = getSide();
        int offset = side / 2;
        int x1 = side * (1 + strikeStart.x()) - offset;
        int x2 = side * (1 + strikeEnd.x()) + offset;
        int y = side * (1 + strikeStart.y());
        graphics.drawLine(x1, y, x2, y);

    }

    private void drawVerticalStrike(Graphics2D graphics) {
        int side = getSide();
        int offset = side / 2;
        int x = side * (1 + strikeStart.x());
        int y1 = side * (1 + strikeStart.y()) - offset;
        int y2 = side * (1 + strikeEnd.y()) + offset;
        graphics.drawLine(x, y1, x, y2);
    }

    private void drawDiagonalStrike(Graphics2D graphics) {
        int side = getSide();
        int offset = side / 2;
        int x1 = side * (1 + strikeStart.x());
        int y1 = side * (1 + strikeStart.y());
        int x2 = side * (1 + strikeStart.x());
        int y2 = side * (1 + strikeStart.y());
        graphics.drawLine(x1, y1, x2, y2);
    }

    private boolean verticalStrike() {
        return strikeStart.x() == strikeEnd.x();
    }

    private boolean horizontalStrike() {
        return strikeStart.y() == strikeEnd.y();
    }

    private int getSide() {
        return Math.min(getWidth(), getHeight()) / 4;
    }

    public void setMarks(Map<Position, Character> marks) {
        this.marks = Map.copyOf(marks);
        repaint();
    }

    public void setStrike(Position strikeStart, Position strikeEnd) {
        this.strikeStart = strikeStart;
        this.strikeEnd = strikeEnd;
        repaint();
    }

    @Override
    protected void processMouseEvent(MouseEvent e) {
        if (e.getID() == MouseEvent.MOUSE_CLICKED && e.getButton() == MouseEvent.BUTTON1) {
            int side = getSide();
            int offset = side / 2;
            int gridX = (e.getX() - offset) / side;
            int gridY = (e.getY() - offset) / side;
            Position.getPosition(gridX, gridY).ifPresent(p -> game.playerPlaces(p));
        }
    }

}



