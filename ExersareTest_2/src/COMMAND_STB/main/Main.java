package COMMAND_STB.main;

import COMMAND_STB.clase.Autobuz;
import COMMAND_STB.clase.ComandaConcreta;
import COMMAND_STB.clase.IComanda;
import COMMAND_STB.clase.OperatorAutobuz;


public class Main {
    public static void main(String[] args) {
        Autobuz a1 = new Autobuz("Mercedes");
        Autobuz a2 = new Autobuz("Otokar");

        OperatorAutobuz operator = new OperatorAutobuz();

        // Operatorul stabileste plecarile dimineata (adauga in colectie)
        operator.adaugaComanda((IComanda) new ComandaConcreta(21,a1));
        operator.adaugaComanda((IComanda) new ComandaConcreta(31,a2));

        System.out.println("S-au stabilit plecarile. Se asteapta disponi'bilitatea...");

        // Cand autobuzele sunt disponibile, se executa totul deodata
        operator.lanseazaComanda();
    }
}
