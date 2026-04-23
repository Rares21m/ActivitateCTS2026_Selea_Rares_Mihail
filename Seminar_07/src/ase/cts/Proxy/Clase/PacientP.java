package ase.cts.Proxy.Clase;

public class PacientP {
    private String nume;
    private boolean areAsigurare;

    public PacientP(String nume, boolean areAsigurare) {
        this.nume = nume;
        this.areAsigurare = areAsigurare;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public boolean isAreAsigurare() {
        return areAsigurare;
    }

    public void setAreAsigurare(boolean areAsigurare) {
        this.areAsigurare = areAsigurare;
    }
}
