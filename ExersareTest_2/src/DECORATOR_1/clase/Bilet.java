package DECORATOR_1.clase;

public class Bilet implements IBilet{
    private String numeFilm;
    private double pret;

    public Bilet(String numeFilm, double pret) {
        this.numeFilm = numeFilm;
        this.pret = pret;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Numele filmului este: "+this.numeFilm);
    }

    @Override
    public double getPret() {
        return this.pret;
    }
}
