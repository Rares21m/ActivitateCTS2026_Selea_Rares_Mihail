package STB_F6_COMPOSITE.clase;

public class Autobuz extends NodStructura {
    private String producator;
    private String model;
    private int nrLocuri;

    public Autobuz(String producator, String model, int nrLocuri) {
        this.producator = producator;
        this.model = model;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public void afiseazaDetalii(String indentare) {
        System.out.println(indentare+" AUTOBUZ: "+this.producator+" MODEL : "+this.model+
                " NRLOCURI: "+this.nrLocuri);
    }
}
