package it.units.sdm;

public class HelloWorldLogic {

    private final HelloWorldView view;

    public HelloWorldLogic(HelloWorldView view) {
        this.view = view;
    }

    public void start() {
        view.show();
    }

    public void onCloseClicked() {
        view.closeWindow();
    }

    static void main() {
        SwingHelloWorld view = new SwingHelloWorld();
        HelloWorldLogic logic = new HelloWorldLogic(view);
        view.installLogic(logic);
        logic.start();
    }
}
