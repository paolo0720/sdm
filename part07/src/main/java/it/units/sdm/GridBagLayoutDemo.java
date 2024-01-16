package it.units.sdm;

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
import static java.awt.GridBagConstraints.NONE;

public class GridBagLayoutDemo {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GridBagLayoutDemo::run);
    }

    private static void run() {
        JFrame frame = new JFrame("GridBagLayout demo");
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Container cp = frame.getContentPane();
        cp.setLayout(new GridBagLayout());
        cp.add(new JButton("1"), new GridBagConstraints(0, 0, 1, 1, 1.0, 0.0, CENTER, NONE, new Insets(0, 0, 0, 0), 0, 0 ));
        cp.add(new JButton("2"), new GridBagConstraints(1, 0, 1, 1, 1.0, 0.0, CENTER, NONE, new Insets(0, 0, 0, 0), 0, 0 ));
        cp.add(new JButton("3"), new GridBagConstraints(2, 0, 1, 1, 1.0, 0.0, CENTER, NONE, new Insets(0, 0, 0, 0), 0, 0 ));
        cp.add(new JButton("4"), new GridBagConstraints(3, 0, 1, 1, 1.0, 0.0, CENTER, NONE, new Insets(0, 0, 0, 0), 0, 0 ));
        cp.add(new JButton("Center"), new GridBagConstraints(0, 1, 4, 1, 1, 1, CENTER, BOTH, new Insets(10, 10, 10, 10), 0, 0 ));
        cp.add(new JButton("A"), new GridBagConstraints(0, 2, 2, 1, 1.0, 0.0, CENTER, HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0 ));
        cp.add(new JButton("B"), new GridBagConstraints(2, 2, 2, 1, 1.0, 0.0, CENTER, HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0 ));
        frame.setSize(500, 300);
        frame.setVisible(true);
    }
}
