package it.units.sdm.oop.florist.messagesandmethods;

public class Wholesaler {

    private final int price;
    private final int deliveryDays;

    public Wholesaler(int price, int deliveryDays) {
        this.price = price;
        this.deliveryDays = deliveryDays;
    }

    public int getPrice() {
        return price;
    }

    public int getDeliveryDays() {
        return deliveryDays;
    }

    public Flowers buyFlowers() {
        return new Flowers();
    }

}
