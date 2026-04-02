package FactoryMethodSpital.Factory;

import FactoryMethodSpital.Clase.Asistent;
import FactoryMethodSpital.Clase.Brancardier;
import FactoryMethodSpital.Clase.Medic;
import FactoryMethodSpital.Clase.PersonalSpitalFM;
import FactoryMethodSpital.Clase.TipPersonal;

public class FactoryPersonalMedical implements FactoryPersonalAbstract {
    @Override
    public PersonalSpitalFM createPersonal(TipPersonal tip, String nume) {
        switch (tip){
            case MEDIC -> {
                return new Medic(nume);
            }
            case BRANCARDIER -> {
                return new Brancardier(nume);
            }
            case ASISTENT -> {
                return new Asistent(nume);
            }
            default -> {
                return null;
            }
        }
    }
}
