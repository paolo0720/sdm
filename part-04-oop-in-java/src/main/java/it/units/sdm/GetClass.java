package it.units.sdm;

public class GetClass {
    static void main() {
        Shop s = new Shop("Today’s bread");
        Florist f1 = new Florist("Flora");
        Shop f2 = new Florist("Rose");
        Object f3 = new Florist("Daisy");

        IO.println("s class is " + s.getClass().getName());
        IO.println("f1 class is " + f1.getClass().getName());
        IO.println("f2 class is " + f2.getClass().getName());
        IO.println("f3 class is " + f3.getClass().getName());
    }
}
