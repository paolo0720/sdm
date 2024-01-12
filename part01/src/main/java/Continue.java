public class Continue {
    public static void main(String[] args) {

        for (int counter = 0; counter < 10; counter++) {
            if (counter % 2 == 1) continue; // start a new iteration if the counter is odd
            System.out.println(counter);
        }
        System.out.println("done.");
    }
}
