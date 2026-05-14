package Observer_4.clase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NotificarePacienti implements INotificare{
    private List<IPacient>listaPacienti;

    public NotificarePacienti() {
        this.listaPacienti = new ArrayList<>();
    }

    @Override
    public void abonarePacient(IPacient pacient) {
        listaPacienti.add(pacient);
    }

    @Override
    public void dezabonarePacient(IPacient pacient) {
        listaPacienti.remove(pacient);
    }

    @Override
    public void notificaPacienti(String mesaj) {
        for(IPacient pacient:listaPacienti){
            pacient.primesteNotificarea(mesaj);
        }
    }
}
