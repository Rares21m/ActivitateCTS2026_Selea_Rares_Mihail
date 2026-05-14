package PROXY_2.main;

import PROXY_2.clase.IPlata;
import PROXY_2.clase.ProcesatorPlata;
import PROXY_2.clase.ProxyPlata;

public class Main {
    public static void main(String[] args) {
        IPlata proxyPlata=new ProxyPlata(new ProcesatorPlata());
        proxyPlata.proceseazaPlata(20.4,19);
        proxyPlata.proceseazaPlata(20,60);
    }
}
