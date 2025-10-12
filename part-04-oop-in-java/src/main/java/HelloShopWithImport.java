import com.esteco.sdm.Shop;

void main() {
    Shop s1 = new Shop("Flora");
    it.units.sdm.Shop s2 = new it.units.sdm.Shop("Flora");

    IO.println("Hello s1: " + s1.getClass().getName());
    IO.println("Hello s2: " + s2.getClass().getName());
}
