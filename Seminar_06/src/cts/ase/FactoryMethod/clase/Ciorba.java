package cts.ase.clase;

public class Ciorba extends Supa{

    public Ciorba(float gramaj, String denumire) {
        super(gramaj, denumire);
    }

    @Override
    public void afiseazaPret() {
        System.out.println("Ciorba "+super.denumire+" are gramaj "+super.gramaj);
    }
}
