package FACADE_02.main;

import FACADE_02.clase.*;

public class Main {
    public static void main(String[] args) {
        SistemBratari bratari=new SistemBratari();
        SistemBilete bilete=new SistemBilete();
        SistemSecuritate securitate=new SistemSecuritate();

        SecuritateCompletaFacade facade=new SecuritateCompletaFacade(bratari,bilete,securitate);

        Festivalier f=new Festivalier("Gigel","INVALID_123","VIP");
        Festivalier f1=new Festivalier("Marian","UNTOLD123","common");


        facade.verificareAcces(f);
        System.out.printf("--------------");
        facade.verificareAcces(f1);
    }
}
