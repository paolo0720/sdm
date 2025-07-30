public class While {
    public static void main(String[] args) {
        final double initialValue = 2.34;
        final double step = 0.11;
        final double limit = 4.69;
        double var = initialValue;
        int counter = 0;
        while (var < limit) {
            var += step;
            counter++;
        }
        System.out.println("Incremented " + counter + " times");
    }
}

