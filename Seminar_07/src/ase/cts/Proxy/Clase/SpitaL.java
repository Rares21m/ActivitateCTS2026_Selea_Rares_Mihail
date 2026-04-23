package ase.cts.Proxy.Clase;

public class SpitaL implements ISpital {
    private String numeSpital;

    public SpitaL(String numeSpital) {
        this.numeSpital = numeSpital;
    }

    public void interneazaPacient(PacientP pacient){
        System.out.println("Pacientul"+pacient.getNume()+" este internat in spitalul"+this.numeSpital);
    }
}
