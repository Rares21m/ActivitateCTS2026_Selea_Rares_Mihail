package SimpleFactoryExersare3;

public class Warrior extends Caracter {

    private int putere;

    public Warrior(String nume, int nivel, int putere) {
        super(nume, nivel);
        this.putere=putere;
    }


    @Override
    public void descriere() {
        StringBuilder sb=new StringBuilder();
        sb.append("Luptatorul are numele :").append(super.nume)
                .append(" si a ajuns la nivelul ").append(super.nivel)
                .append(" care are puterea").append(this.putere);
        System.out.println(sb.toString());
    }
}
