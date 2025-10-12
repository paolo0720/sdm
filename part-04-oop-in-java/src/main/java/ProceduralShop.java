public class ProceduralShop {
    int cash;
}

void processPayment(ProceduralShop shop, int amount) {
    shop.cash -= amount;
}

void main() {
    ProceduralShop shop = new ProceduralShop();
    processPayment(shop, 10);
}
