package FACADE_02.clase;

public class Festivalier {
    private String nume;
    private String codBilet;
    private String tipBratara;

    public Festivalier(String nume, String codBilet, String tipBratara) {
        this.nume = nume;
        this.codBilet = codBilet;
        this.tipBratara = tipBratara;
    }

    public String getNume() {
        return nume;
    }

    public String getCodBilet() {
        return codBilet;
    }

    public String getTipBratara() {
        return tipBratara;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Festivalier{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", codBilet='").append(codBilet).append('\'');
        sb.append(", tipBratara='").append(tipBratara).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
