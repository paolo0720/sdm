package it.units.sdm.assignments;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager2;
import java.awt.Rectangle;
import java.util.HashMap;
import java.util.Map;

public class FixedLayoutManager implements LayoutManager2 {

    private final Map<Component, Rectangle> componentLayout = new HashMap<>();

    @Override
    public void addLayoutComponent(Component comp, Object constraints) {
        componentLayout.put(comp, (Rectangle) constraints);
    }

    @Override
    public Dimension maximumLayoutSize(Container target) {
        return preferredLayoutSize(target);
    }

    @Override
    public float getLayoutAlignmentX(Container target) {
        return 0;
    }

    @Override
    public float getLayoutAlignmentY(Container target) {
        return 0;
    }

    @Override
    public void invalidateLayout(Container target) {
        //do nothing
    }

    @Override
    public void addLayoutComponent(String name, Component comp) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeLayoutComponent(Component comp) {
        componentLayout.remove(comp);
    }

    @Override
    public Dimension preferredLayoutSize(Container parent) {
        return minimumLayoutSize(parent);
    }

    @Override
    public Dimension minimumLayoutSize(Container parent) {
        int maxWidth = 0;
        int maxHeight = 0;
        for (Component component : parent.getComponents()) {
            Rectangle bounds = componentLayout.get(component);
            maxWidth = Math.max(maxWidth, bounds.x + bounds.width);
            maxHeight = Math.max(maxHeight, bounds.y + bounds.height);
        }
        return new Dimension(maxWidth, maxHeight);
    }

    @Override
    public void layoutContainer(Container parent) {
        synchronized (parent.getTreeLock()) {
            for (Component component : parent.getComponents()) {
                component.setBounds(componentLayout.get(component));
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Fixed layout");
            frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            frame.getContentPane().setLayout(new FixedLayoutManager());
            frame.getContentPane().add(new JLabel("Test"), new Rectangle(10, 10, 200, 50));
            frame.getContentPane().add(new JButton("Click me (when you are ready)"), new Rectangle(220, 110, 100, 50));
            frame.setSize(400, 400);
            frame.setVisible(true);
        });
    }
}
