void main() {
    final double initialValue = 2.34;
    final double step = 0.11;
    final double limit = 4.69;
    double var = initialValue;

    int counter = 0;
    do {
        var += step;
        counter++;
    } while (var < limit);
    IO.println("Incremented " + counter + " times");
}

