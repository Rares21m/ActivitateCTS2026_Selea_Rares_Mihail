package SPITAL_A10_FLYWEIGHT.main;

import SPITAL_A10_FLYWEIGHT.clase.IInternat;
import SPITAL_A10_FLYWEIGHT.clase.InternareFactory;
import SPITAL_A10_FLYWEIGHT.clase.Pacient;
import SPITAL_A10_FLYWEIGHT.clase.Salon;

public class Main {
    public static void main(String[] args) {

        InternareFactory factory=new InternareFactory();

        factory.getInternat("Marius").interneaza(new Salon(3,2,3));
        factory.getInternat("Marian").interneaza(new Salon(3,2,3));
    }
}
