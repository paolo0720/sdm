package it.units.sdm.oop.florist.polymorphic;

public class FastFlorist implements Florist {
    private final Wholesaler[] wholesalers;

    public FastFlorist(Wholesaler[] wholesalers) {
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
        Wholesaler fastest = wholesalers[0];
        for (Wholesaler wholesaler : wholesalers) {
            if (wholesaler.getDeliveryDays() < fastest.getDeliveryDays()) {
                fastest = wholesaler;
            }
        }
        return fastest;
    }

    private void arrangeFlowers() {
        // TODO
    }

    private void deliverFlowers(Flowers flowers, Person person) {
        // TODO
    }
}
