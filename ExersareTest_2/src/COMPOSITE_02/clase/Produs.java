package COMPOSITE_02.clase;

public class Produs implements IComponenta{
    private String nume;
    private double pret;


    public Produs(String nume, double pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public double getPret() {
        return pret;
    }

    @Override
    public void afisare(String indentare) {
        System.out.println(indentare+ " Produsul se numeste "+this.nume+
                " si are pretul de "+this.pret);
    }

    @Override
    public double calculeazaPretTotal() {
        return this.pret;
    }
}
