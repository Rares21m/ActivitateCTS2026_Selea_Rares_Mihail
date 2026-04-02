package SimpleFactorySpital;

public class Main {
    public static void main(String[] args) {
        FactoryPersonal fabricaPersonal=new FactoryPersonal();
        PersonalSpital medic=fabricaPersonal.getTipPersonal(TipPersonal.MEDIC,"Marian",20);
        medic.AfiseazaDescrierePersonal();

        PersonalSpital brancardier=fabricaPersonal.getTipPersonal(TipPersonal.BRANCARDIER,"Ionela",10);
        brancardier.AfiseazaDescrierePersonal();
    }
}
