package OBSERVER_1.clase;

import java.util.ArrayList;
import java.util.List;

public class MagazinOnline implements IMagazin{
    private String nume;
    private List<IObserver> listaAbonati;

    public MagazinOnline(String nume) {
        this.nume = nume;
        this.listaAbonati = new ArrayList<>();
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        for(IObserver client:listaAbonati){
            client.primesteNotificare(mesaj);
        }
    }

    @Override
    public void aboneazaPacient(IObserver client) {
        listaAbonati.add(client);
    }

    @Override
    public void dezaboneazaPacient(IObserver client) {
        listaAbonati.remove(client);
    }

    public void anuntaReduceri(int procent){
        trimiteMesaj("Avem reduceri la "
                +this.nume+" de "+procent);
    }
}
