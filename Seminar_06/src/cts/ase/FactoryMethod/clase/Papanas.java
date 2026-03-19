package cts.ase.clase;

public class Papanas extends Desert{

    public Papanas(float gramaj, String denumire, float calorii) {
        super(gramaj, denumire, calorii);
    }

    @Override
    public void afiseazaPret() {
        System.out.println("Papanasi cu "+super.denumire+" au "+super.gramaj+" grame si au caloriile "+super.calorii);

    }
}
