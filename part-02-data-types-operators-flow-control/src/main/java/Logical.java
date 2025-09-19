void main() {
    int x = 12, y = 33;
    double d = 2.45, e = 4.54;

    IO.println(x < y && d < e);
    IO.println(!(x < y));

    boolean test = 'a' > 'z';
    IO.println(test || d - 2.1 > 0);
}
