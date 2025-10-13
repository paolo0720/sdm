package it.units.sdm;

public class DegreeMain {

    public static void main(String[] args) {
        for (Degree d : Degree.values()) {
            IO.println(d.getTitle());
        }

    }
}
