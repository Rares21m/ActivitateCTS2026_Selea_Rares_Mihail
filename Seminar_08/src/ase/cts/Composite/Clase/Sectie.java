package ase.cts.Composite.Clase;

import java.rmi.StubNotFoundException;

public class Sectie implements Structura {
    private String numeAngajati;
    private int nrAngajati;

    public Sectie(String numeAngajati, int nrAngajati) {
        this.numeAngajati = numeAngajati;
        this.nrAngajati = nrAngajati;
    }

    @Override
    public void afiseazaDetaliiStructura(String spatii) {
        System.out.println(spatii + "Nume sectie "+this.numeAngajati+" nr angajati "+this.nrAngajati);
    }
}
