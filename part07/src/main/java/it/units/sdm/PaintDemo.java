package it.units.sdm;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import static java.awt.RenderingHints.KEY_ANTIALIASING;
import static java.awt.RenderingHints.VALUE_ANTIALIAS_ON;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class PaintDemo extends JComponent {

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D scratch = (Graphics2D) g.create();
        try {
            Dimension size = getSize();
            scratch.setRenderingHint(KEY_ANTIALIASING, VALUE_ANTIALIAS_ON);
            scratch.setPaint(Color.BLUE.darker());
            scratch.fillRect(0, 0, size.width, size.height);
            scratch.setPaint(Color.WHITE);
            scratch.setStroke(new BasicStroke(20));
            scratch.drawLine(0, 0, size.width, size.height);
            scratch.drawLine(0, size.height, size.width, 0);
        } finally {
            scratch.dispose();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame();
            frame.getContentPane().add(new PaintDemo());
            frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            frame.setSize(300, 200);
            frame.setVisible(true);
        });
    }
}

