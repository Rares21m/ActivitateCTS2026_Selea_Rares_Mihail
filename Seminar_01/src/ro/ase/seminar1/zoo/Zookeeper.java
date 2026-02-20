package ro.ase.seminar1.zoo;

import ro.ase.seminar1.animale.Animal;

public class Zookeeper {
    private String nume;

    public void feedAnimal(Animal animal) {
        System.out.println("ro.ase.seminar1.zoo.Zookeeper-ul "+nume+" a hranit "+ animal.toString());
        animal.eat(" Mancare foarte buna ");


    }

    public Zookeeper(String nume) {
        this.nume = nume;
    }
}
