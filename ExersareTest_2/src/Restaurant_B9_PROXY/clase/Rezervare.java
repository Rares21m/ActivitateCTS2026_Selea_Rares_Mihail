package Restaurant_B9_PROXY.clase;

public class Rezervare implements IRezervare{
    private String numeClient;
    private String oraRezerare;

    public Rezervare(String numeClient, String oraRezerare) {
        this.numeClient = numeClient;
        this.oraRezerare = oraRezerare;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public String getOraRezerare() {
        return oraRezerare;
    }

    @Override
    public void ralizareRezervare(int nrPersoane) {
        System.out.println("REZERVARE REALIZATA PE NUMELE "+this.numeClient+
                " LA ORA "+this.oraRezerare+" SI NUMARUL DE PERSOANE: "+nrPersoane);
    }
}
