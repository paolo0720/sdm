package it.units.sdm.assignments;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CalculatorTest {

    @Test
    void start() {
        DisplaySpy display = new DisplaySpy();
        Calculator calculator = new Calculator(display);

        calculator.start();

        assertTrue(display.shown);
        assertEquals("0", display.displayed);
    }

    @Test
    void zeroZeroPressed() {
        DisplaySpy display = new DisplaySpy();
        Calculator calculator = new Calculator(display);
        calculator.start();

        calculator.zeroPressed();
        calculator.zeroPressed();

        assertEquals("0", display.displayed);
    }

    @Nested
    class OnePlusTwoEqualsThree {
        @Test
        void onePressed() {
            DisplaySpy display = new DisplaySpy();
            Calculator calculator = new Calculator(display);
            calculator.start();

            calculator.onePressed();

            assertEquals("1", display.displayed);
        }

        @Test
        void onePlusTwoPressed() {
            DisplaySpy display = new DisplaySpy();
            Calculator calculator = new Calculator(display);
            calculator.start();

            calculator.onePressed();
            calculator.addPressed();
            calculator.twoPressed();

            assertEquals("2", display.displayed);
        }

        @Test
        void onePlusTwoEqualPressed() {
            DisplaySpy display = new DisplaySpy();
            Calculator calculator = new Calculator(display);
            calculator.start();

            calculator.onePressed();
            calculator.addPressed();
            calculator.twoPressed();
            calculator.equalPressed();

            assertEquals("3", display.displayed);
        }

    }

    @Nested
    class OnePlusThreeEqualsFour {
        @Test
        void onePlusThreePressed() {
            DisplaySpy display = new DisplaySpy();
            Calculator calculator = new Calculator(display);
            calculator.start();

            calculator.onePressed();
            calculator.addPressed();
            calculator.threePressed();

            assertEquals("3", display.displayed);

        }

        @Test
        void onePlusThreeEqualPressed() {
            DisplaySpy display = new DisplaySpy();
            Calculator calculator = new Calculator(display);
            calculator.start();

            calculator.onePressed();
            calculator.addPressed();
            calculator.threePressed();
            calculator.equalPressed();

            assertEquals("4", display.displayed);
        }
    }

    @Nested
    class OneOnePlusFourEqualsFifteen {
        @Test
        void oneOnePressed() {
            DisplaySpy display = new DisplaySpy();
            Calculator calculator = new Calculator(display);
            calculator.start();

            calculator.onePressed();
            calculator.onePressed();

            assertEquals("11", display.displayed);
        }

        @Test
        void oneOnePlusFourPressed() {
            DisplaySpy display = new DisplaySpy();
            Calculator calculator = new Calculator(display);
            calculator.start();

            calculator.onePressed();
            calculator.onePressed();
            calculator.addPressed();
            calculator.fourPressed();

            assertEquals("4", display.displayed);
        }

        @Test
        void oneOnePlusFourEqualPressed() {
            DisplaySpy display = new DisplaySpy();
            Calculator calculator = new Calculator(display);
            calculator.start();

            calculator.onePressed();
            calculator.onePressed();
            calculator.addPressed();
            calculator.fourPressed();
            calculator.equalPressed();

            assertEquals("15", display.displayed);
        }

    }

    @Test
    void multiplication() {
        DisplaySpy display = new DisplaySpy();
        Calculator calculator = new Calculator(display);
        calculator.start();

        calculator.sevenPressed();
        calculator.multiplyPressed();
        calculator.sixPressed();
        calculator.equalPressed();

        assertEquals("42", display.displayed);
    }

    @Test
    void division() {
        DisplaySpy display = new DisplaySpy();
        Calculator calculator = new Calculator(display);
        calculator.start();

        calculator.twoPressed();
        calculator.dividePressed();
        calculator.threePressed();
        calculator.equalPressed();

        assertEquals("0.6666666666666666", display.displayed);
    }

    @Test
    void chainingAdditions() {
        DisplaySpy display = new DisplaySpy();
        Calculator calculator = new Calculator(display);
        calculator.start();

        calculator.onePressed();
        calculator.addPressed();
        calculator.twoPressed();
        calculator.addPressed();

        assertEquals("3", display.displayed);
    }

    @Test
    void chainingAdditionAndSubstraction() {
        DisplaySpy display = new DisplaySpy();
        Calculator calculator = new Calculator(display);
        calculator.start();

        calculator.onePressed();
        calculator.addPressed();
        calculator.twoPressed();
        calculator.subtractPressed();

        assertEquals("3", display.displayed);
    }

    @Test
    void chaining() {
        DisplaySpy display = new DisplaySpy();
        Calculator calculator = new Calculator(display);
        calculator.start();

        calculator.onePressed();
        calculator.subtractPressed();
        calculator.threePressed();
        calculator.multiplyPressed();
        calculator.fourPressed();
        calculator.signPressed();
        calculator.dividePressed();
        calculator.twoPressed();
        calculator.equalPressed();

        assertEquals("4", display.displayed);
    }

    @Test
    void dotPressed() {
        DisplaySpy display = new DisplaySpy();
        Calculator calculator = new Calculator(display);
        calculator.start();

        calculator.onePressed();
        calculator.dotPressed();
        calculator.threePressed();

        assertEquals("1.3", display.displayed);
    }

    @Test
    void percent() {
        DisplaySpy display = new DisplaySpy();
        Calculator calculator = new Calculator(display);
        calculator.start();

        calculator.sevenPressed();
        calculator.twoPressed();
        calculator.addPressed();
        calculator.fivePressed();
        calculator.percentPressed();

        assertEquals("3.6", display.displayed);
    }

    @Test
    void percentSum() {
        DisplaySpy display = new DisplaySpy();
        Calculator calculator = new Calculator(display);
        calculator.start();

        calculator.sevenPressed();
        calculator.twoPressed();
        calculator.addPressed();
        calculator.fivePressed();
        calculator.percentPressed();
        calculator.equalPressed();

        assertEquals("75.6", display.displayed);
    }

    static class DisplaySpy implements Display {

        String displayed;
        boolean shown;

        @Override
        public void show() {
            shown = true;
        }

        @Override
        public void display(String text) {
            displayed = text;
        }
    }
}