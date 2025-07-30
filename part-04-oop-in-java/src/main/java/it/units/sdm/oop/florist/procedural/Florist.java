package it.units.sdm.oop.florist.procedural;

public class Florist {

    private final Wholesaler[] wholesalers;

    public Florist(Wholesaler[] wholesalers) {
        this.wholesalers = wholesalers;
    }

    public Wholesaler[] getWholesalers() {
        return wholesalers;
    }
}
