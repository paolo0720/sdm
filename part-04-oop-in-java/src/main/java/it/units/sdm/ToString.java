package it.units.sdm;

public class ToString {

    static void main() {
        Shop s = new Shop("Beefeater");
        Florist f = new Florist("Flora");

        IO.println("s: " + s);
        IO.println("f: " + f);
    }
}
