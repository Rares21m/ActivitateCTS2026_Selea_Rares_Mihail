package SimpleFactoryExersare3;

public abstract class Caracter {
    protected String nume;
    protected int nivel;

    public Caracter(String nume, int nivel) {
        this.nume = nume;
        this.nivel = nivel;
    }

    public abstract void descriere();
}
