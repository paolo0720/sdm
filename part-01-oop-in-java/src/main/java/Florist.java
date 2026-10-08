void main() {
    Florist flora = new Florist ("Flora");
    Wholesaler wholesaler = new Wholesaler("Floribunda");
    IO.println(wholesaler.name);

    flora.buy(wholesaler, 5);

    IO.println(wholesaler.name);
}

public class Florist {
    String name;
    int inventory;

    Florist(String name) {
        this.name = name;
    }

    void buy(Wholesaler wholesaler, int amount) {
        wholesaler.supply(amount);
        wholesaler.name = "Goodsaler";
        this.inventory += amount;
    }
}

class Wholesaler {
    String name;

    Wholesaler(String name) {
        this.name = name;
    }

    void supply(int amount) {
        //do something
    }
}

