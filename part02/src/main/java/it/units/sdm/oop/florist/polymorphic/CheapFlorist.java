package it.units.sdm.oop.florist.polymorphic;

public class CheapFlorist implements Florist {

    private final Wholesaler[] wholesalers;

    public CheapFlorist(Wholesaler[] wholesalers) {
        this.wholesalers = wholesalers;
    }

    public void sendFlowersTo(Person person) {
        Flowers flowers = buyFlowers();
        flowers.arrange();
        deliverFlowers(flowers, person);
    }

    private Flowers buyFlowers() {
        return selectWholesaler().buyFlowers();
    }

    private Wholesaler selectWholesaler() {
        Wholesaler cheapest = wholesalers[0];
        for (Wholesaler wholesaler : wholesalers) {
            if (wholesaler.getPrice() < cheapest.getPrice()) {
                cheapest = wholesaler;
            }
        }
        return cheapest;
    }

    private void arrangeFlowers() {
        // TODO
    }

    private void deliverFlowers(Flowers flowers, Person person) {
        // TODO
    }
}
