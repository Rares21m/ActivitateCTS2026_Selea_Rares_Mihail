package SimpleFactoryExersare3;

public class FactoryCaracter {
    public static Caracter getCaracter(TipCaracter tip,String nume,int nivel){
        switch (tip){
            case MAGE -> {
                return new Mage(nume,nivel,250);
            }
            case ARCHER -> {
                return new Archer(nume,nivel,34);
            }

            case WARRIOR -> {
                return new Warrior(nume,nivel,65);
            }
            default -> {
                return null;
            }
        }
    }
}
