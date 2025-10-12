package it.units.sdm;

public class InstanceOf {

    static void main(String[] args) {
        Shop s = new Shop("Today's bread");
        Shop f = new Florist("Flora");

        IO.println("is s a Shop? " + (s instanceof Shop));
        IO.println("is s a Florist? " + (s instanceof Florist));
        IO.println("is f a Shop? " + (f instanceof Shop));
        IO.println("is f a Florist? " + (f instanceof Florist));
    }
}
