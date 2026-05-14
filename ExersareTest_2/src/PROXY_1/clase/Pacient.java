package PROXY_1.clase;

public class Pacient {
    private String nume;
    private String istoricMedical;

    public Pacient(String nume, String istoricMedical) {
        this.nume = nume;
        this.istoricMedical = istoricMedical;
    }

    public String getNume() {
        return nume;
    }

    public String getIstoricMedical() {
        return istoricMedical;
    }
}
