package it.units.sdm;

public class Florist extends Shop {

    int inventory;

    Florist(String name) {
        super(name);
    }

    void deliverFlower(String address) {
        //do something
        inventory--;
    }

    void sellFlower() {
        inventory--;
    }
}
