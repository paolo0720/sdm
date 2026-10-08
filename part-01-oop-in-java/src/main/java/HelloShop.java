void main() {
    com.esteco.sdm.Shop s1 = new com.esteco.sdm.Shop("Flora");
    it.units.sdm.Shop s2 = new it.units.sdm.Shop("Flora");

    IO.println("Hello s1: " + s1.getClass().getName());
    IO.println("Hello s2: " + s2.getClass().getName());
}
