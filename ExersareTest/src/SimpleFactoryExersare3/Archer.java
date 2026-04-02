package SimpleFactoryExersare3;

public class Archer extends Caracter{
    private int agilitate;

    public Archer(String nume, int nivel,int agilitate) {
        super(nume, nivel);
        this.agilitate=agilitate;
    }

    @Override
    public void descriere() {
        StringBuilder sb=new StringBuilder();
        sb.append("Arcasul are numele :").append(super.nume)
                .append(" si a ajuns la nivelul ").append(super.nivel)
                .append(" care are agilitatea : ").append(this.agilitate);
        System.out.println(sb.toString());
    }
}
