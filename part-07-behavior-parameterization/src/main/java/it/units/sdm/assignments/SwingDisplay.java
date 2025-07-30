package it.units.sdm.assignments;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import static java.awt.GridBagConstraints.BOTH;
import static java.awt.GridBagConstraints.CENTER;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class SwingDisplay implements Display {

    private final JTextField textField;
    private Calculator calculator;
    private JPanel panel;

    public SwingDisplay() {
        panel = new JPanel(new GridBagLayout());
        textField = new JTextField();
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        panel.add(textField, gridConstraints(0, 0, 4));

        JButton cButton = new JButton("C");
        cButton.addActionListener(e -> calculator.cPressed());
        panel.add(cButton, gridConstraints(0, 1, 1));

        JButton signButton = new JButton("+/-");
        signButton.addActionListener(e -> calculator.signPressed());
        panel.add(signButton, gridConstraints(1, 1, 1));

        JButton percentButton = new JButton("%");
        percentButton.addActionListener(e -> calculator.percentPressed());
        panel.add(percentButton, gridConstraints(2, 1, 1));

        JButton divideButton = new JButton("/");
        divideButton.addActionListener(e -> calculator.dividePressed());
        panel.add(divideButton, gridConstraints(3, 1, 1));

        JButton sevenButton = new JButton("7");
        sevenButton.addActionListener(e -> calculator.sevenPressed());
        panel.add(sevenButton, gridConstraints(0, 2, 1));

        JButton eightButton = new JButton("8");
        eightButton.addActionListener(e -> calculator.eightPressed());
        panel.add(eightButton, gridConstraints(1, 2, 1));

        JButton nineButton = new JButton("9");
        nineButton.addActionListener(e -> calculator.ninePressed());
        panel.add(nineButton, gridConstraints(2, 2, 1));

        JButton multiplyButton = new JButton("x");
        multiplyButton.addActionListener(e -> calculator.multiplyPressed());
        panel.add(multiplyButton, gridConstraints(3, 2, 1));

        JButton fourButton = new JButton("4");
        fourButton.addActionListener(e -> calculator.fourPressed());
        panel.add(fourButton, gridConstraints(0, 3, 1));

        JButton fiveButton = new JButton("5");
        fiveButton.addActionListener(e -> calculator.fivePressed());
        panel.add(fiveButton, gridConstraints(1, 3, 1));

        JButton sixButton = new JButton("6");
        sixButton.addActionListener(e -> calculator.sixPressed());
        panel.add(sixButton, gridConstraints(2, 3, 1));

        JButton substractButton = new JButton("-");
        substractButton.addActionListener(e -> calculator.subtractPressed());
        panel.add(substractButton, gridConstraints(3, 3, 1));

        JButton oneButton = new JButton("1");
        oneButton.addActionListener(e -> calculator.onePressed());
        panel.add(oneButton, gridConstraints(0, 4, 1));

        JButton twoButton = new JButton("2");
        twoButton.addActionListener(e -> calculator.twoPressed());
        panel.add(twoButton, gridConstraints(1, 4, 1));

        JButton threeButton = new JButton("3");
        threeButton.addActionListener(e -> calculator.threePressed());
        panel.add(threeButton, gridConstraints(2, 4, 1));

        JButton addButton = new JButton("+");
        addButton.addActionListener(e -> calculator.addPressed());
        panel.add(addButton, gridConstraints(3, 4, 1));

        JButton zeroButton = new JButton("0");
        zeroButton.addActionListener(e -> calculator.zeroPressed());
        panel.add(zeroButton, gridConstraints(0, 5, 2));

        JButton dotButton = new JButton(".");
        dotButton.addActionListener(e -> calculator.dotPressed());
        panel.add(dotButton, gridConstraints(2, 5, 1));

        JButton equalButton = new JButton("=");
        equalButton.addActionListener(e -> calculator.equalPressed());
        panel.add(equalButton, gridConstraints(3, 5, 1));
    }

    private static GridBagConstraints gridConstraints(int gridx, int gridy, int gridwidth) {
        return new GridBagConstraints(gridx, gridy, gridwidth, 1, 1, 1, CENTER, BOTH, new Insets(0, 0, 0, 0), 0, 0);
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void show() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void display(String text) {
        textField.setText(text);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SwingDisplay swingDisplay = new SwingDisplay();
            swingDisplay.setCalculator(new Calculator(swingDisplay));
            swingDisplay.show();
        });
    }
}

