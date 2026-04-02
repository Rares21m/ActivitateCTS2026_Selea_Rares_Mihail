package SimpleFactoryExersare.Clase;

public class Troleibuz extends MijlocTransport{

    public Troleibuz(int nrLinie, String marca) {
        super(nrLinie, marca);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb=new StringBuilder();
        sb.append("Troleibuzul are ").append(this.nrLinie)
                .append(" si este din marca ").append(this.marca);
        System.out.println(sb.toString());
    }
}
