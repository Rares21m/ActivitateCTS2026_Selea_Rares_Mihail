package SimpleFactoryExersare.Clase;

public abstract class MijlocTransport {
    protected int nrLinie;
    protected String marca;

    public MijlocTransport(int nrLinie, String marca) {
        this.nrLinie = nrLinie;
        this.marca = marca;
    }

    public abstract void afiseazaDescriere();
}
