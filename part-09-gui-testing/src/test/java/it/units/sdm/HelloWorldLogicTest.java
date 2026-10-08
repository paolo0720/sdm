package it.units.sdm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldLogicTest {

    @Test
    void logicShowsTheView() {
        HelloWorldViewSpy view = new HelloWorldViewSpy();
        HelloWorldLogic logic = new HelloWorldLogic(view);

        logic.start();

        assertTrue(view.shown);
    }

    @Test
    void logicClosesTheView() {
        HelloWorldViewSpy view = new HelloWorldViewSpy();
        HelloWorldLogic logic = new HelloWorldLogic(view);

        logic.onCloseClicked();

        assertTrue(view.closed);
    }

    private static class HelloWorldViewSpy implements HelloWorldView {

        private boolean shown;
        private boolean closed;

        @Override
        public void closeWindow() {
            closed = true;
        }

        @Override
        public void show() {
            shown = true;
        }
    }
}