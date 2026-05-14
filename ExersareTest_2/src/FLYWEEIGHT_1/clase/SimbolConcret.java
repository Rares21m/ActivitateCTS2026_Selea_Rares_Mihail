package FLYWEEIGHT_1.clase;

public class SimbolConcret implements ISimbol{

    private String tipSimbol;
    private String reprezentareGrafica;

    public SimbolConcret(String tipSimbol, String reprezentareGrafica) {
        this.tipSimbol = tipSimbol;
        this.reprezentareGrafica = reprezentareGrafica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SimbolConcret{");
        sb.append("tipSimbol='").append(tipSimbol).append('\'');
        sb.append(", reprezentareGrafica='").append(reprezentareGrafica).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afisare(Pacient detalii) {
        System.out.println(this.toString()+"   "+detalii.toString());
    }
}
