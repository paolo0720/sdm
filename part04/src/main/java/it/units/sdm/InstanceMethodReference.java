package it.units.sdm;

import java.util.Random;

public class InstanceMethodReference {

    public static void main(String[] args) {
        Random random = new Random();
        RandomGenerator g1 = s -> random.nextInt(s);
        RandomGenerator g2 = random::nextInt;

        System.out.println(g1.get(10));
        System.out.println(g2.get(10));
    }

    interface RandomGenerator {
        int get(int scale);
    }

}
