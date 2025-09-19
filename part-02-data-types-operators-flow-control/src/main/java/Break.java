void main() {

    for (int counter = 0; counter < 10; counter++) {

        if (counter % 2 == 1) continue; // start a new iteration if the counter is odd
        if (counter == 8) break; // exit the loop if the counter is equal to 8

        IO.println(counter);
    }
    IO.println("done.");
}
