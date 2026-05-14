package FLYWEEIGHT_1.clase;

public class Pacient {
    private String numePacient;
    private int nrPat;

    public Pacient(String numePacient, int nrPat) {
        this.numePacient = numePacient;
        this.nrPat = nrPat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("numePacient='").append(numePacient).append('\'');
        sb.append(", nrPat=").append(nrPat);
        sb.append('}');
        return sb.toString();
    }
}
