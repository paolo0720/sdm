package it.units.sdm;

import java.util.Objects;

public class Shop {
    private String name;
    private String address;
    private boolean open;

    public Shop(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void open() {
        open = true;
    }

    public void close() {
        open = false;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Shop shop = (Shop) o;
        return open == shop.open && Objects.equals(name, shop.name) && Objects.equals(address, shop.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, open);
    }
}
