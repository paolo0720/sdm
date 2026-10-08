package it.units.sdm;

import java.util.Random;

public class InstanceMethodReference {

    static void main() {
        Random random = new Random();
        RandomGenerator g1 = s -> random.nextInt(s);
        RandomGenerator g2 = random::nextInt;

        IO.println(g1.get(10));
        IO.println(g2.get(10));
    }

    interface RandomGenerator {
        int get(int scale);
    }

}
