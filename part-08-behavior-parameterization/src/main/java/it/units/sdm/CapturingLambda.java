package it.units.sdm;

public class CapturingLambda {

    private double a = 3.14;
    private Runnable runnable;

    public CapturingLambda() {
        double b = 0.1;
        runnable = () -> IO.println(a + b);
    }

    public void apply() {
        runnable.run();
    }

    public void update() {
        a = 9.81;
    }

    static void main() {
        CapturingLambda capturingLambda = new CapturingLambda();
        capturingLambda.apply();
        capturingLambda.update();
        capturingLambda.apply();
    }
}
