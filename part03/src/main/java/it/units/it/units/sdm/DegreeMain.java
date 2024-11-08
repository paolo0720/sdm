package it.units.it.units.sdm;

public class DegreeMain {

    public static void main(String[] args) {
        for (Degree d : Degree.values()) {
            System.out.println(d.getTitle());
        }

    }
}
