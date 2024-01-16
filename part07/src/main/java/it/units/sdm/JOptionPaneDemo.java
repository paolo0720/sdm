package it.units.sdm;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import static javax.swing.JOptionPane.showConfirmDialog;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class JOptionPaneDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(JOptionPaneDemo::demo);
    }

    private static void demo() {
        String name = showInputDialog(null, "What's your name");
        int result = showConfirmDialog(null, "Your name is: " + name + "\n Is it right?");
        if (result == JOptionPane.OK_OPTION) {
            showMessageDialog(null, "Hi " + name + "!");
        } else {
            showMessageDialog(null, "Try again", "Incorrect name", JOptionPane.ERROR_MESSAGE);
        }
    }
}

