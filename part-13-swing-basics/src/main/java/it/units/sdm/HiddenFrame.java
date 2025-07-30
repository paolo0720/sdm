package it.units.sdm;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class HiddenFrame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(HiddenFrame::hideFrame);
    }

    private static void hideFrame() {
        JFrame frame = new JFrame("A frame that will be hidden");
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}
