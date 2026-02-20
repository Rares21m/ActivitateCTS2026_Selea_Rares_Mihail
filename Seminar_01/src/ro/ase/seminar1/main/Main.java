package ro.ase.seminar1.main;

import ro.ase.seminar1.animale.Lion;
import ro.ase.seminar1.animale.Tigru;
import ro.ase.seminar1.animale.Zebra;
import ro.ase.seminar1.zoo.Zoo;
import ro.ase.seminar1.zoo.Zookeeper;

public class Main {

    public static void main(String []args){
        Zookeeper zookeeper=new ro.ase.seminar1.zoo.Zookeeper("Rares");

        Lion firstLion=new Lion("Simba",4,160);
        Zebra firstZebra=new Zebra("MartyKazoo",3,290);


        Zoo gradinaZoo=new Zoo("Gradina zoo Bucuresti Jungle",zookeeper);

        gradinaZoo.adaugaAnimal(firstZebra);
        gradinaZoo.adaugaAnimal(firstLion);
        gradinaZoo.adaugaAnimal(new Tigru("Floricel",2,"Asiatic"));

        gradinaZoo.feedAllAnimals();


    }
}
