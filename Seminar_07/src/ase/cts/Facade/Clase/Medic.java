package ase.cts.Facade.Clase;

public class Medic {
    private String nume;

    public boolean areBiletDeTriemitere(Pacient pacient ){
//        if(pacient.getGravitate()>=6){
//            return true;
//        }
//        else return false;
        return pacient.getGravitate()>=6;
    }

    public Medic(String nume) {
        this.nume = nume;
    }
}
