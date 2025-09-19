static int sum(int[] array) {
    int s = 0;
    for (int i : array) {
        s = s + i;
    }
    return s;
}

void main() {
    int[] a = {71, 4, 31, 53};
    IO.println(sum(a));
}

