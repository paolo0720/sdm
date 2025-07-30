package it.units.sdm.oop.florist.polymorphic;


public class Person {

    public static void main(String[] args) {
        Person robin = new Person();
        Florist fred = new CheapFlorist(new Wholesaler[]{new Wholesaler(10, 3), new Wholesaler(12, 2)});
        //Florist fred = new FastFlorist(new Wholesaler[]{new Wholesaler(10, 3), new Wholesaler(12, 2)});

        fred.sendFlowersTo(robin);
    }
}
