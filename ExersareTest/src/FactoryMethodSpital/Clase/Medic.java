package FactoryMethodSpital.Clase;

public class Medic extends PersonalSpitalFM {
    public Medic(String nume) {
        super(nume);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb=new StringBuilder();
        sb.append("Medicul are numele ").append(this.nume);
        System.out.println(sb.toString());
    }
}
