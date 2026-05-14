package OBSERVER_1.clase;

public interface IMagazin {
    void trimiteMesaj(String mesaj);

    void aboneazaPacient(IObserver client);
    void dezaboneazaPacient(IObserver client);
}
