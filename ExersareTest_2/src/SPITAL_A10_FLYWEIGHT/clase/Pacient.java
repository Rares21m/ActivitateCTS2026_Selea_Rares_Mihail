package SPITAL_A10_FLYWEIGHT.clase;

public class Pacient implements IInternat{
    private String nume;
    private String nrTel;

    public Pacient(String nume, String nrTel) {
        this.nume = nume;
        this.nrTel = nrTel;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("nume=").append(nume);
        sb.append(", nrTel='").append(nrTel).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void interneaza(Salon salon) {
        System.out.println(this.toString()+"  "+salon.toString());
    }
}
