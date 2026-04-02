package FactoryMethodSpital.Clase;

public abstract class PersonalSpitalFM {
    protected String nume;

    public PersonalSpitalFM(String nume) {
        this.nume = nume;
    }

    public abstract void afiseazaDescriere();

}
