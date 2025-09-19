void main() {

    for (int counter = 0; counter < 10; counter++) {
        // start a new iteration if the counter is odd
        if (counter % 2 == 1) continue;
        IO.println(counter);
    }
    IO.println("done.");
}
