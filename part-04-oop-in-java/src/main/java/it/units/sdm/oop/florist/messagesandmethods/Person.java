package it.units.sdm.oop.florist.messagesandmethods;

public class Person {

    public static void main(String[] args) {
        Person robin = new Person();
        Florist fred = new Florist(new Wholesaler[]{new Wholesaler(10, 3), new Wholesaler(12, 2)});

        fred.sendFlowersTo(robin);
    }
}
