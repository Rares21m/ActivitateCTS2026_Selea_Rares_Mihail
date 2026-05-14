package STB_F11_OBSERVER.clase;

import java.util.ArrayList;
import java.util.List;

public class PlecareAutobuz implements IPlecareAutobuz{

    private String nume;
    private List<ICalator> listaCalatori;

    public PlecareAutobuz(String nume) {
        this.nume = nume;
        this.listaCalatori = new ArrayList<>();
    }

    @Override
    public void abonareClient(ICalator calator) {
        listaCalatori.add(calator);
    }

    @Override
    public void dezabonareClient(ICalator calator) {
        listaCalatori.remove(calator);
    }

    @Override
    public void trimiteMesajul(String mesaj) {
        for(ICalator calator:listaCalatori){
            calator.primesteNotificarea(mesaj);
        }
    }
}
