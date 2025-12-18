public class Florist extends TaxPayer {

    public Florist(String name, String taxCode) {
        super(name, taxCode);
    }

    public void sendFlowers(Person recipient) {
        IO.println(getName() + " is sending flowers to " + recipient.getName());
    }
}
