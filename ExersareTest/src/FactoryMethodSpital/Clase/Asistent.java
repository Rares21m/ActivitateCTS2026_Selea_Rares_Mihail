package FactoryMethodSpital.Clase;

public class Asistent extends PersonalSpitalFM {
    public Asistent(String nume) {
        super(nume);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb=new StringBuilder();
        sb.append("Asistentul are numele ").append(this.nume);
        System.out.println(sb.toString());
    }
}
