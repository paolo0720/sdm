package it.units.sdm;

public class InstanceOf {

    public static void main(String[] args) {
        Television tv = new Television("LG120");
        Television ptv = new PlasmaTelevision("LG121");

        System.out.println("is tv a Television? " + (tv instanceof Television));
        System.out.println("is tv a PlasmaTelevision? " + (tv instanceof PlasmaTelevision));
        System.out.println("is ptv a Television? " + (ptv instanceof Television));
        System.out.println("is ptv a PlasmaTelevision? " + (ptv instanceof PlasmaTelevision));
    }
}
