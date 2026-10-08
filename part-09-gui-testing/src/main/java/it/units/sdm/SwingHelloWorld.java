package it.units.sdm;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import java.awt.BorderLayout;

public class SwingHelloWorld implements HelloWorldView {

    private JFrame frame;
    private HelloWorldLogic logic;

    public void installLogic(HelloWorldLogic logic) {
        this.logic = logic;
    }

    private void buildAndShow() {
        frame = new JFrame("A message to the World");
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        JLabel label = new JLabel("Hello, World!");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        frame.getContentPane().add(label, BorderLayout.CENTER);
        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(x -> logic.onCloseClicked());
        frame.getContentPane().add(closeButton, BorderLayout.SOUTH);
        frame.setSize(400, 200);
        frame.setVisible(true);
    }

    @Override
    public void show() {
        SwingUtilities.invokeLater(this::buildAndShow);
    }

    @Override
    public void closeWindow() {
        SwingUtilities.invokeLater(frame::dispose);
    }
}
