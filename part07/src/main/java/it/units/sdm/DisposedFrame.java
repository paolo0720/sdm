package it.units.sdm;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class DisposedFrame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(DisposedFrame::disposeFrame);
    }

    private static void disposeFrame() {
        JFrame frame = new JFrame("A frame that will be disposed");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setVisible(true);
    }

}
