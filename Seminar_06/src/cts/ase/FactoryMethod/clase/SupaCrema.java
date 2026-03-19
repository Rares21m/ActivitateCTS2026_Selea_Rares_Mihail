package cts.ase.clase;

public class SupaCrema extends Supa {

    public SupaCrema(float gramaj, String denumire) {
        super(gramaj, denumire);
    }

    @Override
    public void afiseazaPret(){
        System.out.println("Supa crema "+ super.denumire+" are "+ super.gramaj+" grame");
    }
}
