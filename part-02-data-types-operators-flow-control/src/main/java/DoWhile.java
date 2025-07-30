public class DoWhile {
    public static void main(String[] args) {
        final double initialValue = 2.34;
        final double step = 0.11;
        final double limit = 4.69;
        double var = initialValue;

        int counter = 0;
        do {
            var += step;
            counter++;
        } while (var < limit);
        System.out.println("Incremented " + counter + " times");
    }
}

