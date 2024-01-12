class HelloTelevision {

    public static void main(String args[]) {
        com.esteco.sdm.Television tv1 = new com.esteco.sdm.Television("LG121");
        it.units.sdm.Television tv2 = new it.units.sdm.Television("LG121");

        System.out.println("Hello tv1: " + tv1.getClass().getName());
        System.out.println("Hello tv2: " + tv2.getClass().getName());
    }
}
