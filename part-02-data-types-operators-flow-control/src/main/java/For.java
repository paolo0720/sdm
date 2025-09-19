void main() {
    final double initialValue = 2.34;
    final double step = 0.11;
    final double limit = 4.69;
    int counter = 0;

    for (double var = initialValue; var < limit; var += step)
        counter++;
    IO.println("Incremented " + counter + " times");
}

