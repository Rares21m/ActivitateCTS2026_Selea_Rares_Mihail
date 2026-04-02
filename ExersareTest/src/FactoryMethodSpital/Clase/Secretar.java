package FactoryMethodSpital.Clase;

public class Secretar extends PersonalSpitalFM {
    public Secretar(String nume) {
        super(nume);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb=new StringBuilder();
        sb.append("Secretarul are numele ").append(this.nume);
        System.out.println(sb.toString());
    }
}
