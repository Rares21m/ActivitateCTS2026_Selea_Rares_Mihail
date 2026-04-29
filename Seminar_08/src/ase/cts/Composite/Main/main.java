package ase.cts.Composite.Main;

import ase.cts.Composite.Clase.Departament;
import ase.cts.Composite.Clase.Sectie;
import ase.cts.Composite.Clase.Structura;

public class main {
    public static void main(String[] args) {

        Structura depSpital=new Departament("Spital");
        Structura depAdm=new Departament("Administratie");
        Structura sectieSecretariat=new Sectie("Secretariat",20);
        Structura sectieManagement=new Sectie("Management",10);

        ((Departament) depSpital).adaugaStructura(depAdm);
        ((Departament) depSpital).adaugaStructura(sectieManagement);
        ((Departament) depAdm).adaugaStructura(sectieSecretariat);

        depSpital.afiseazaDetaliiStructura("");

        ((Departament) depSpital).stergeStructura(sectieManagement);
        ((Departament) depAdm).adaugaStructura(sectieManagement);
    }
}
