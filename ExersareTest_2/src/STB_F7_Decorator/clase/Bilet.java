package STB_F7_Decorator.clase;

public class Bilet implements IBilet{
    private String codBilet;
    private int nrBilet;

    public Bilet(String codBilet, int nrBilet) {
        this.codBilet = codBilet;
        this.nrBilet = nrBilet;
    }


    @Override
    public void afiseazaBilet() {
        System.out.println("COD BILET: "+this.codBilet+" NR BILET: "+this.nrBilet);
    }
}
