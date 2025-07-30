public class Strings {
    public static void main(String[] args) {
        String a = "abc";

        int cost = 2;
        String b = "the cost is " + cost + " euro";

        String bb = "the cost is " + cost + cost + " euro";

        System.out.println(a);
        System.out.println(b);
        System.out.println(bb);
    }
}
