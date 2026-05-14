package FLYWEEIGHT_1.main;

import FLYWEEIGHT_1.clase.ISimbol;
import FLYWEEIGHT_1.clase.Pacient;
import FLYWEEIGHT_1.clase.SimbolConcret;
import FLYWEEIGHT_1.clase.SimbolFactory;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new Pacient("Marian", 3);
        Pacient pacient2 = new Pacient("Maria", 5);
        Pacient pacient3 = new Pacient("Ion", 10);

        // 2. Inițializăm Fabrica (Depozitul)
        SimbolFactory fabricaDeSimbol = new SimbolFactory();

        // 3. Cerem simboluri de la Fabrică (NU facem new!)
        // Prima dată când cerem "EKG", Fabrica îl va crea.
        fabricaDeSimbol.getSimbol("EKG").afisare(pacient1);

        // A doua oară când cerem "EKG", Fabrica îl dă pe cel existent.
        // Observă că Marian și Maria folosesc ACELAȘI obiect SimbolConcret.
        fabricaDeSimbol.getSimbol("EKG").afisare(pacient2);

        // Cerem un tip nou. Fabrica va crea unul nou.
        fabricaDeSimbol.getSimbol("Puls").afisare(pacient3);


    }
}
