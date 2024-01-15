package it.units.sdm;

public class CapturingLambda {

    private double a = 3.14;

    public CapturingLambda() {
        double b = 0.1;
        Runnable lambda = () -> System.out.println(a + b);
        lambda.run();
        a = 6;
        lambda.run();
    }

    public static void main(String[] args) {
        CapturingLambda capturingLambda = new CapturingLambda();
    }
}
