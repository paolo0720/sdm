package it.units.it.units.sdm;

public enum Degree {

    HIGH_SCHOOL("High school"), LAUREA("Laurea"), MASTER("Master"), PHD("PhD");

    private final String title;

    Degree(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
