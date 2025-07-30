package it.units.sdm;

import java.text.NumberFormat;
import java.util.Locale;

public class Calculator {

    private final Display display;
    private char operator;
    private double lastOperand;
    private double operand;
    private int dot;

    public Calculator(Display display) {
        this.display = display;
    }

    public static void main(String[] args) {
        Display display = new Display() {
            @Override
            public void display(String text) {
                System.out.println(text);
            }
        };

        var calculator = new Calculator(display);
        calculator.onePressed();
        calculator.addPressed();
        calculator.twoPressed();
        calculator.addPressed();
        calculator.twoPressed();
        calculator.equalPressed();
    }

    private void digitPressed(int digit) {
        if (dot > 0) {
            operand = operand + digit * Math.pow(0.1, dot);
            dot++;
        } else {
            operand = operand * 10 + digit;
        }
        display(operand);
    }

    public void onePressed() {
        digitPressed(1);
    }

    public void twoPressed() {
        digitPressed(2);
    }

    public void threePressed() {
        digitPressed(3);
    }

    public void fourPressed() {
        digitPressed(4);
    }

    public void fivePressed() {
        digitPressed(5);
    }

    public void sixPressed() {
        digitPressed(6);
    }

    public void sevenPressed() {
        digitPressed(7);
    }

    public void eightPressed() {
        digitPressed(8);
    }

    public void ninePressed() {
        digitPressed(9);
    }

    public void zeroPressed() {
        digitPressed(0);
    }

    public void addPressed() {
        equalPressed();
        operand = 0;
        operator = '+';
    }

    public void multiplyPressed() {
        equalPressed();
        operand = 0;
        operator = '*';
    }

    public void subtractPressed() {
        equalPressed();
        operand = 0;
        operator = '-';
    }

    public void dividePressed() {
        equalPressed();
        operand = 0;
        operator = '/';
    }

    public void signPressed() {
        operand = -operand;
        display(operand);
    }

    public void dotPressed() {
        dot = 1;
    }

    public void cPressed() {
        operand = 0;
        lastOperand = 0;
        operator = 0;
        display(operand);
    }

    public void percentPressed() {
        operand = lastOperand * (operand / 100);
        display(operand);
    }

    private void display(double number) {
        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
        numberFormat.setMaximumFractionDigits(16);
        numberFormat.setMinimumFractionDigits(0);
        display.display(numberFormat.format(number));
    }

    public void equalPressed() {
        if (operator == '+') {
            lastOperand += operand;
        } else if (operator == '*') {
            lastOperand *= operand;
        } else if (operator == '-') {
            lastOperand -= operand;
        } else if (operator == '/') {
            lastOperand /= operand;
        } else {
            lastOperand = operand;
        }
        display(lastOperand);
        operator = 0;
        dot = 0;
    }

}
