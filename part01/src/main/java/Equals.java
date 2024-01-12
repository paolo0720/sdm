public class Equals {
    public static void main(String[] args) {
        String s1 = "Java is great!";
        String s2 = "Java" + " is great!";
        String a = "Java";
        String b = " is great!";
        String s3 = a + b;

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("s3: " + s3);

        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1.equals(s2): " + s1.equals(s2));
        System.out.println("s1 == s3: " + (s1 == s3));
        System.out.println("s1.equals(s3): " + s1.equals(s3)); //result changes when a and b are final
    }
}
