package it.units.sdm.assignments;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import static java.awt.GridBagConstraints.BOTH;
import static java.awt.GridBagConstraints.CENTER;
import static java.awt.GridBagConstraints.HORIZONTAL;
import static java.awt.GridBagConstraints.VERTICAL;

public class GridImplementsBorder {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GridImplementsBorder::run);
    }

    private static void run() {
        JFrame frame = new JFrame("GridImplementsBorder demo");
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Container cp = frame.getContentPane();
        cp.setLayout(new GridBagLayout());
        cp.add(new JButton("North"), new GridBagConstraints(0, 0, 3, 1, 1.0, 0, CENTER, HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));
        cp.add(new JButton("South"), new GridBagConstraints(0, 2, 3, 1, 1.0, 0, CENTER, HORIZONTAL, new Insets(0, 5, 5, 5), 0, 0));
        cp.add(new JButton("East"), new GridBagConstraints(2, 1, 1, 1, 0.0, 1.0, CENTER, VERTICAL, new Insets(0, 0, 5, 5), 0, 0));
        cp.add(new JButton("West"), new GridBagConstraints(0, 1, 1, 1, 0.0, 1.0, CENTER, VERTICAL, new Insets(0, 5, 5, 5), 0, 0));
        cp.add(new JButton("Center"), new GridBagConstraints(1, 1, 1, 1, 1.0, 1.0, CENTER, BOTH, new Insets(0, 0, 5, 5), 0, 0));
        frame.setSize(500, 400);
        frame.setVisible(true);
    }
}
