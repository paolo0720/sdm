package it.units.sdm.interfaces;

class Dog implements Zoo.Animal {
    public String speak() {return "woof";}
}

class Cat implements Zoo.Animal {
    public String speak() {return "meow";}
}

class RobotDog extends Robot implements Zoo.Animal {
    public String speak() {return "wauf";}
}

public class Zoo {

    interface Animal {
        String speak();
    }

    void makeItSpeak(Animal a) {
        IO.println(a.speak());
    }

    void main() {
        makeItSpeak(new Dog()); //woof
        makeItSpeak(new Cat()); //meow
    }
}

