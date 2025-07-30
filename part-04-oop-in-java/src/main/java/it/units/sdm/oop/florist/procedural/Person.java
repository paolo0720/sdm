package it.units.sdm.oop.florist.procedural;

public class Person {

    private static void sendFlowersTo(Florist florist, Person person) {
        Flowers flowers = buyFlowers(florist);
        arrange(flowers);
        deliverFlowers(flowers, person);
    }

    private static Flowers buyFlowers(Florist florist) {
        Wholesaler wholesaler = selectWholesaler(florist.getWholesalers());
        return wholesaler.buyFlowers();
    }

    private static Wholesaler selectWholesaler(Wholesaler[] wholesalers) {
        Wholesaler cheapest = wholesalers[0];
        for (Wholesaler wholesaler : wholesalers) {
            if (wholesaler.getPrice() < cheapest.getPrice()) {
                cheapest = wholesaler;
            }
        }
        return cheapest;
    }

    private static void arrange(Flowers flowers) {
        // TODO
    }

    private static void deliverFlowers(Flowers flowers, Person person) {
        // TODO
    }

    public static void main(String[] args) {
        Person robin = new Person();
        Florist fred = new Florist(new Wholesaler[]{new Wholesaler(10, 3), new Wholesaler(12, 2)});
        sendFlowersTo(fred, robin);
    }
}
