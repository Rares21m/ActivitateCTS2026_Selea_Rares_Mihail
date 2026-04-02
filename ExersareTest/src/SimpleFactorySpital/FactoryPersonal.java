package SimpleFactorySpital;

public class FactoryPersonal {
    public PersonalSpital getTipPersonal(TipPersonal tip,String nume,Integer vechime){
        switch (tip){
            case BRANCARDIER -> {
                return new Brancardier(nume,vechime);
            }
            case MEDIC -> {
                return new Medic(nume,vechime);
            }
            case ASISTENT -> {
                return new Asistent(nume,vechime);
            }
            default -> {
                return null;
            }
        }
    }
}
