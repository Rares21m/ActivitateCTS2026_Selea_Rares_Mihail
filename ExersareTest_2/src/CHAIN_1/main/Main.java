package CHAIN_1.main;

import CHAIN_1.clase.Asistent;
import CHAIN_1.clase.Manager;
import CHAIN_1.clase.Specialist;
import CHAIN_1.clase.SuportHandeler;

public class Main {
    public static void main(String[] args) {
        SuportHandeler asistent=new Asistent();
        SuportHandeler manager=new Manager();
        SuportHandeler specialist=new Specialist();

        asistent.setSuccesor(specialist);
        specialist.setSuccesor(manager);

        System.out.println(asistent.recomandareSuport(4));
        System.out.println(asistent.recomandareSuport(10));
        System.out.println(asistent.recomandareSuport(30));
    }


}
