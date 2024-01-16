package it.units.sdm;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Point2D;

import static java.awt.RenderingHints.KEY_ANTIALIASING;
import static java.awt.RenderingHints.VALUE_ANTIALIAS_ON;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

public class AnimationDemo extends JComponent {

    private final Dimension speed;
    private final Point2D position;
    private final Timer timer;

    public AnimationDemo() {
        position = new Point2D.Double(0, 0);
        speed = new Dimension(5, 5);
        timer = new Timer(20, this::update);
    }

    public void start() {
        timer.start();
    }

    public void stop() {
        timer.stop();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D scratch = (Graphics2D) g.create();
        try {
            scratch.setRenderingHint(KEY_ANTIALIASING, VALUE_ANTIALIAS_ON);
            scratch.fillOval((int) position.getX(), (int) position.getY(), 10, 10);
        } finally {
            scratch.dispose();
        }
    }

    public void update(ActionEvent e) {
        position.setLocation(position.getX() + speed.width, position.getY() + speed.height);
        if (position.getX() < 0) {
            speed.width = -speed.width;
            position.setLocation(-position.getX(), position.getY());
        } else if (position.getX() > getWidth()) {
            speed.width = -speed.width;
            position.setLocation(getWidth() - (position.getX() - getWidth()), position.getY());
        }
        if (position.getY() < 0) {
            speed.height = -speed.height;
            position.setLocation(position.getX(), -position.getY());
        } else if (position.getY() > getHeight()) {
            speed.height = -speed.height;
            position.setLocation(position.getX(), getHeight() - (position.getY() - getHeight()));
        }
        repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Animation demo");
            AnimationDemo animationDemo = new AnimationDemo();
            frame.getContentPane().add(animationDemo);
            frame.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            frame.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    animationDemo.stop();
                    frame.dispose();
                }
            });
            frame.setSize(200, 200);
            frame.setVisible(true);
            animationDemo.start();
        });
    }

}
