package cts.ase.Prototype.clase;

public class Rezervare implements IRezervare{
   private String numeClient;
   private int ora;
   private int nrPersoane;
   private String nrCardului;

   private Rezervare(){

   }

    public Rezervare(String numeClient, int ora, int nrPersoane, String nrCardului) {
        this.numeClient = numeClient;
        if(ora>=11&& ora<=22) {
         this.ora=ora;
        }else{
            this.ora=11;
        }
        this.ora = ora;
        this.nrPersoane = nrPersoane;

        if(nrCardului.length()==16) {
            this.nrCardului = nrCardului;
        }else{
            this.nrCardului="0000000000000000";
        }
    }

    @Override
    public IRezervare copiaza() {
        Rezervare rezervare = new Rezervare();

        rezervare.numeClient=this.numeClient;
        rezervare.ora=this.ora;
        rezervare.nrPersoane=this.nrPersoane;
        rezervare.nrCardului=this.nrCardului;
        return rezervare;
    }
}
