void main() {
    final double initialValue = 2.34;
    final double step = 0.11;
    final double limit = 4.69;
    double var = initialValue;
    int counter = 0;
    while (var < limit) {
        var += step;
        counter++;
    }
    IO.println("Incremented " + counter + " times");
}

