public class Sum {
    public static int sum(int[] array) {
        int s = 0;
        for (int i : array) {
            s = s + i;
        }
        return s;
    }

    public static void main(String[] args) {
        int[] a = {71, 4, 31, 53};
        System.out.println(sum(a));
    }
}

