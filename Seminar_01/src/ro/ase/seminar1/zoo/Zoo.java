package ro.ase.seminar1.zoo;

import ro.ase.seminar1.animale.Animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String nume;
    Zookeeper zookeeper;
    List<Animal> animale;

    public void feedAllAnimals(){
        for(Animal animal :animale){
            zookeeper.feedAnimal(animal);
        }
    }

    public Zoo(String nume, Zookeeper zookeeper) {
        this.nume = nume;
        this.zookeeper = zookeeper;
        this.animale = new ArrayList<>();
    }

    public void adaugaAnimal(Animal animal){
        animale.add(animal);
    }


}
