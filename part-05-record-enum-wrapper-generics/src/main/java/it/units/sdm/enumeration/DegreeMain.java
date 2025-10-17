package it.units.sdm.enumeration;

public class DegreeMain {

    public static void main(String[] args) {
        for (Degree d : Degree.values()) {
            IO.println(d.getTitle());
        }

    }
}
