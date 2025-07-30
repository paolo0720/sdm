package it.units.sdm;

public record Dish(String name, boolean vegetarian, int calories, Type type) {

    public enum Type {MEAT, FISH, OTHER}

    @Override
    public String toString() {
        return name;
    }

}
