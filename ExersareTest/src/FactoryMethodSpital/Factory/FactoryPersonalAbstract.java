package FactoryMethodSpital.Factory;

import FactoryMethodSpital.Clase.PersonalSpitalFM;
import FactoryMethodSpital.Clase.TipPersonal;

public interface FactoryPersonalAbstract {
    PersonalSpitalFM createPersonal(TipPersonal tip, String nume);
}
