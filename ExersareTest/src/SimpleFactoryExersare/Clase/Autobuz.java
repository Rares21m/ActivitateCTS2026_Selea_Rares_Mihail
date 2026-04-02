package SimpleFactoryExersare.Clase;

public class Autobuz extends MijlocTransport{


    public Autobuz(int nrLinie, String marca) {
        super(nrLinie, marca);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb=new StringBuilder();
        sb.append("Autobuzul are ").append(this.nrLinie)
                .append(" si este din marca ").append(this.marca);
        System.out.println(sb.toString());
    }
}
