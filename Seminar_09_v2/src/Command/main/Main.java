package Command.main;

import Command.clase.Autobuz;
import Command.clase.Command;
import Command.clase.Operator;
import Command.clase.Plecare;

public class Main {
    public static void main(String[] args) {

        Operator operator=new Operator();
        Command comanda1=new Plecare(new Autobuz("Medcedes"),234);
        Command comanda3=new Plecare(new Autobuz("Ferrari"),381);
        operator.adaugaComanda(comanda1);
        operator.adaugaComanda(comanda3);
        operator.adaugaComanda(new Plecare(new Autobuz("Dacia"),234));

        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
    }
}
