package it.units.sdm.enumeration;

public enum Degree {

    HIGH_SCHOOL("High school", 5), BACHELOR("Bachelor", 3), MASTER("Master", 2), PHD("PhD", 3);

    private final String title;
    private final int duration;

    Degree(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return title;
    }
}
