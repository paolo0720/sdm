void main() {
    int[] a = {2, 4, 3, 1};

    int sum = 0;
    for (int x : a) {
        sum += x;
    }

    double[] d = new double[sum];
    for (int i = 0; i < d.length; i++) {
        d[i] = 1.0 / (i + 1);
    }

    for (var f : d) {
        IO.println(f);
    }
}

