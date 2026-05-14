package Restaurant_B9_PROXY.clase;

public class FiltruRezervare implements IRezervare {
    IRezervare rezervare;

    public FiltruRezervare(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void ralizareRezervare(int nrPersoane) {
        if(nrPersoane<4){
            System.out.println("Rezervarea nu poate fi finalizata");
        }
        else{
            rezervare.ralizareRezervare(nrPersoane);
        }
    }
}
