package FactoryMethodSpital.Factory;

import FactoryMethodSpital.Clase.PersonalSpitalFM;
import FactoryMethodSpital.Clase.Registrator;
import FactoryMethodSpital.Clase.Secretar;
import FactoryMethodSpital.Clase.TipPersonal;

public class FactoryPersonalNonMedical implements FactoryPersonalAbstract {
    @Override
    public PersonalSpitalFM createPersonal(TipPersonal tip, String nume) {
        switch (tip){
            case SECRETAR -> {
                return new Secretar(nume);
            }
            case REGISTRATOR -> {
                return new Registrator(nume);
            }
            default -> {
                return null;
            }
        }
    }
}
