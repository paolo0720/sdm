package it.units.sdm;

public class StringEquals {

    static void main() {
        String s1 = "Java is great!";
        String s2 = "Java" + " is great!";
        String a = "Java";
        String b = " is great!";
        String s3 = a + b;

        IO.println("s1: " + s1);
        IO.println("s2: " + s2);
        IO.println("s3: " + s3);

        IO.println("s1.equals(s2): " + s1.equals(s2));
        IO.println("s1 == s2: " + (s1 == s2));
        IO.println("s1.equals(s3): " + s1.equals(s3));
        IO.println("s1 == s3: " + (s1 == s3));
    }
}
