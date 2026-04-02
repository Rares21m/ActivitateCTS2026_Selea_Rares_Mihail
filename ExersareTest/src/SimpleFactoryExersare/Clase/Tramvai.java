package SimpleFactoryExersare.Clase;

import java.sql.SQLOutput;

public class Tramvai extends MijlocTransport{


    public Tramvai(int nrLinie, String marca) {
        super(nrLinie, marca);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb=new StringBuilder();
        sb.append("Tramvaiul are ").append(this.nrLinie)
                .append(" si este din marca ").append(this.marca);
        System.out.println(sb.toString());
    }
}
