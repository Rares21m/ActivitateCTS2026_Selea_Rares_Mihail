package SimpleFactoryExersare3;

public class Mage extends Caracter{
    private int mana;

    public Mage(String nume, int nivel,int mana) {
        super(nume, nivel);
        this.mana=mana;
    }


    @Override
    public void descriere() {
        StringBuilder sb=new StringBuilder();
        sb.append("Vrajitorul are numele :").append(super.nume)
                .append(" si a ajuns la nivelul ").append(super.nivel)
                .append(" care are mana").append(this.mana);
        System.out.println(sb.toString());
    }
}
