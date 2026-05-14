package Composite_1.clase;

public class Sectie implements IStructura {
    private String numeSectie;
    private int nrAngajati;

    public Sectie(String numeSectie, int nrAngajati) {
        this.numeSectie = numeSectie;
        this.nrAngajati = nrAngajati;
    }


    @Override
    public void AfiseazaStructura(String indentare) {
        System.out.println(indentare+" Nume sectie: "+this.numeSectie+ " nr angajati: "+this.nrAngajati);
    }
}
