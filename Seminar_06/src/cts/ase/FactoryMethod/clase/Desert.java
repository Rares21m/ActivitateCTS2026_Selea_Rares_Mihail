package cts.ase.clase;

public abstract class Desert implements FelDeMancare{
    protected float gramaj;
    protected String denumire;
    protected float calorii;

    public Desert(float gramaj, String denumire, float calorii) {
        this.gramaj = gramaj;
        this.denumire = denumire;
        this.calorii = calorii;
    }
}
