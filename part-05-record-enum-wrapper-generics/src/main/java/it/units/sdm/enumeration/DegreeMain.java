package it.units.sdm.enumeration;

public class DegreeMain {

    static void main() {
        for (Degree d : Degree.values()) {
            IO.println(d.getTitle());
        }

    }
}
