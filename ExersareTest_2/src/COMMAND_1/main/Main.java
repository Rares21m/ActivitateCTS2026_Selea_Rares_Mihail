package COMMAND_1.main;

import COMMAND_1.clase.ComandaDepunere;
import COMMAND_1.clase.ComandaRetragere;
import COMMAND_1.clase.ContBancar;
import COMMAND_1.clase.ServerBancar;

public class Main {
    public static void main(String[] args) {
        ContBancar cont=new ContBancar("RNTB00032020243");

        ServerBancar server=new ServerBancar();

        server.primesteComanda(new ComandaRetragere(342,cont));
        server.primesteComanda(new ComandaDepunere(cont,4354));

        server.trimiteSpreExecutie();
        server.trimiteSpreExecutie();


    }
}
