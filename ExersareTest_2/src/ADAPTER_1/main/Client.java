package ADAPTER_1.main;

import ADAPTER_1.clase.AdapterBanca;
import ADAPTER_1.clase.BancaNoua;
import ADAPTER_1.clase.IPos;

public class Client {
    public static void main(String[] args) {
        BancaNoua bancaNoua=new BancaNoua();

        IPos terminal=new AdapterBanca(bancaNoua);

        terminal.platesteSuma(100.4);
    }
}
