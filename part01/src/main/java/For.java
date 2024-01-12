public class For {
    public static void main(String[] args) {
        final double initialValue = 2.34;
        final double step = 0.11;
        final double limit = 4.69;
        int counter = 0;

        for (double var = initialValue; var < limit; var += step)
            counter++;
        System.out.println("Incremented " + counter + " times");
    }
}

