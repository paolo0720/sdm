public class TestCast {
    public static void main(String[] args) {
        int a = 'x';        // 'x' is a character
        long b = 34;         // 34 is an int
        float c = 1002;      // 1002 is an int
        double d = 3.45F;    // 3.45F is a float

        long e = 34;
        int f = (int) e;          // e is a long
        double g = 3.45;
        float h = (float) g;      // g is a double

    }
}
