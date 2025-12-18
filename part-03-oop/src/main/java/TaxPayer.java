public class TaxPayer extends Person {
    private String taxCode;

    public TaxPayer(String name, String taxCode) {
        super(name);
        this.taxCode = taxCode;
    }

    public void payTaxes() {
        IO.println(getName() + " is paying taxes with code " + taxCode);
    }
}
