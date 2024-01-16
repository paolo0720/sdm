package it.units.sdm;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;

import static java.awt.AWTEvent.MOUSE_EVENT_MASK;
import static java.awt.AWTEvent.MOUSE_MOTION_EVENT_MASK;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class EventDemo extends JComponent {

    private boolean pressed;

    public EventDemo() {
        enableEvents(MOUSE_EVENT_MASK | MOUSE_MOTION_EVENT_MASK);
    }

    @Override
    protected void processMouseEvent(MouseEvent e) {
        switch (e.getID()) {
            case MouseEvent.MOUSE_PRESSED -> {
                pressed = true;
                repaint();
            }
            case MouseEvent.MOUSE_RELEASED -> {
                pressed = false;
                repaint();
            }
        }
        super.processMouseEvent(e);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D scratch = (Graphics2D) g.create();
        try {
            scratch.setPaint(pressed ? Color.YELLOW : Color.BLUE);
            scratch.fillRect(0, 0, getWidth(), getHeight());
        } finally {
            g.dispose();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Event Demo");
            frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            frame.getContentPane().add(new EventDemo());
            frame.setSize(200, 200);
            frame.setVisible(true);
        });
    }
}
