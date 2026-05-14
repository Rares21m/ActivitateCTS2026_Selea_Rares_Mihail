package PROXY_1.main;

import PROXY_1.clase.*;

public class Main {
    public static void main(String[] args) {
        IRegistru registru=new RegistruMedicalProxy();
        registru.afiseazaDosar(new Pacient("Marian","Starea pacientului este stabila"),new Angajat("Ion","Medic"));
        registru.afiseazaDosar(new Pacient("Marian","Starea pacientului este instabila"),new Angajat("Ion","Asistent"));
    }
}
