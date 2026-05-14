package Composite_1.main;

import Composite_1.clase.Departament;
import Composite_1.clase.IStructura;
import Composite_1.clase.Sectie;

public class Main {
    public static void main(String[] args) {
        IStructura depMain=new Departament("Spital");
        IStructura sectie=new Sectie("Cardiologie",43);
        IStructura departament=new Departament("Inima");

        ((Departament) depMain).adaugaStructura(departament);
        ((Departament) departament).adaugaStructura(sectie);

        depMain.AfiseazaStructura(" ");
    }
}
