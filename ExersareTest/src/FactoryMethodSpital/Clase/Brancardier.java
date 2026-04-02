package FactoryMethodSpital.Clase;

public class Brancardier extends PersonalSpitalFM {
    public Brancardier(String nume) {
        super(nume);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb=new StringBuilder();
        sb.append("Brancardierul are numele ").append(this.nume);
        System.out.println(sb.toString());
    }
}
