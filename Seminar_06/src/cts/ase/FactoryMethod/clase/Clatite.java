package cts.ase.FactoryMethod.clase;

public class Clatite extends Desert{

    public Clatite(float gramaj, String denumire, float calorii) {
        super(gramaj, denumire, calorii);
    }

    @Override
    public void afiseazaPret() {
        System.out.println("Clatite cu "+super.denumire+" au "+super.gramaj+"grame si "+super.calorii+" calorii");
    }
}
