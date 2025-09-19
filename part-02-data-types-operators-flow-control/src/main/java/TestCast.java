void main() {
    int a = 'x';         // 'x' is a character
    long b = 34;         // 34 is an int
    float c = 1002;      // 1002 is an int
    double d = 3.45F;    // 3.45F is a float

    int f = (int) b;     // e is a long
    float h = (float) d; // g is a double
    byte g = (byte) c;   // c is a float

    IO.println(f);
    IO.println(h);
    IO.println(g);
}
