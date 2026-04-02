package FactoryMethodSpital.Clase;

public class Registrator extends PersonalSpitalFM {


    public Registrator(String nume) {
        super(nume);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb=new StringBuilder();
        sb.append("Registratorul are numele ").append(this.nume);
        System.out.println(sb.toString());
    }
}
