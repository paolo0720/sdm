package it.units.sdm;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class SwingDemo {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SwingDemo::buildAndShow);
    }

    private static void buildAndShow() {
        JFrame frame = new JFrame("Swing Demo");
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Container cp = frame.getContentPane();
        cp.setLayout(new BorderLayout());
        JLabel label = new JLabel("Hello, World!");
        label.setOpaque(true);

        JPanel northPanel = new JPanel(new GridBagLayout());
        JLabel textLabel = new JLabel("Label text:");
        northPanel.add(textLabel, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 4, 0, 0), 0, 0));
        JTextField textField = new JTextField(30);
        textField.addActionListener(e -> label.setText(textField.getText()));
        northPanel.add(textField, new GridBagConstraints(1, 0, 1, 1, 1.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(4, 4, 4, 4), 0, 0));

        JPanel southPanel = new JPanel(new FlowLayout());
        JSlider sizeSlider = new JSlider(SwingConstants.HORIZONTAL, 1, 160, label.getFont().getSize());
        sizeSlider.addChangeListener(e -> label.setFont(label.getFont().deriveFont((float) sizeSlider.getValue())));
        southPanel.add(sizeSlider);
        JButton changeColorButton = new JButton("Change background");
        JCheckBox showBackground = new JCheckBox("Show background");
        showBackground.addActionListener(e -> {
            label.setOpaque(showBackground.isSelected());
            label.repaint();
            changeColorButton.setEnabled(showBackground.isSelected());
        });
        southPanel.add(showBackground);
        changeColorButton.setEnabled(false);
        changeColorButton.addActionListener(e -> {
            label.setBackground(JColorChooser.showDialog(frame, "Choose background color", label.getBackground()));
        });
        southPanel.add(changeColorButton);

        JComboBox<Integer> alignmentComboBox = new JComboBox<>(
                new Integer[]{SwingConstants.LEFT, SwingConstants.CENTER, SwingConstants.RIGHT});
        alignmentComboBox.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                switch ((Integer) value) {
                    case SwingConstants.LEFT -> value = "Left";
                    case SwingConstants.CENTER -> value = "Center";
                    case SwingConstants.RIGHT -> value = "Right";
                }
                return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            }
        });
        alignmentComboBox.setSelectedItem(label.getHorizontalAlignment());
        alignmentComboBox.addActionListener(e -> {
            label.setHorizontalAlignment((Integer) alignmentComboBox.getSelectedItem());
        });
        southPanel.add(alignmentComboBox);

        cp.add(new JScrollPane(label), BorderLayout.CENTER);
        cp.add(northPanel, BorderLayout.NORTH);
        cp.add(southPanel, BorderLayout.SOUTH);
        frame.setSize(600, 200);
        frame.setVisible(true);

    }
}
