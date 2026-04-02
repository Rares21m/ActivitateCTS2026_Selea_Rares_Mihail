package SimpleFactorySpital;

public abstract class PersonalSpital {
    protected String nume;
    protected int vechimeAni;

    public PersonalSpital(String nume, int vechimeAni) {
        this.nume = nume;
        this.vechimeAni = vechimeAni;
    }

    public abstract void AfiseazaDescrierePersonal();

}
