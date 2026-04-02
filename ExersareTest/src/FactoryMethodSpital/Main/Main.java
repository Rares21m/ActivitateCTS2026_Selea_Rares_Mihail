package FactoryMethodSpital.Main;

import FactoryMethodSpital.Clase.PersonalSpitalFM;
import FactoryMethodSpital.Factory.FactoryPersonalAbstract;
import FactoryMethodSpital.Factory.FactoryPersonalMedical;
import FactoryMethodSpital.Factory.FactoryPersonalNonMedical;
import FactoryMethodSpital.Clase.TipPersonal;

public class Main {
    public static void main(String[] args) {
        FactoryPersonalAbstract factoryMedical = new FactoryPersonalMedical();
        PersonalSpitalFM medic = factoryMedical.createPersonal(TipPersonal.MEDIC, "Popescu");
        PersonalSpitalFM asistent = factoryMedical.createPersonal(TipPersonal.ASISTENT, "Ionescu");
        PersonalSpitalFM brancardier = factoryMedical.createPersonal(TipPersonal.BRANCARDIER, "Georgescu");

        FactoryPersonalAbstract factoryNonMedical = new FactoryPersonalNonMedical();
        PersonalSpitalFM secretar = factoryNonMedical.createPersonal(TipPersonal.SECRETAR, "Marin");
        PersonalSpitalFM registrator = factoryNonMedical.createPersonal(TipPersonal.REGISTRATOR, "Dumitrescu");

        medic.afiseazaDescriere();
        asistent.afiseazaDescriere();
        brancardier.afiseazaDescriere();
        secretar.afiseazaDescriere();
        registrator.afiseazaDescriere();
    }
}
