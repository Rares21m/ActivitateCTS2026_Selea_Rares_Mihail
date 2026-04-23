package ase.cts.Facade.Implementare;

import ase.cts.Facade.Clase.Medic;
import ase.cts.Facade.Clase.Pacient;
import ase.cts.Facade.Clase.Salon;

public class SpitalFacade {
    private Medic medic;
    private Salon salon;

    public void interneazaPacient(Pacient pacient){
        if(pacient.getGravitate()>=4){
            if(medic.areBiletDeTriemitere(pacient)){
                int nrPat=salon.existaPaturiLibere();
                if(salon.existaPaturiLibere()!=-1){
                    System.out.println("Pacientul "+pacient.getNume()+" trebuie sa fie internat in patul "+nrPat);
                    salon.ocupaPat(nrPat);
                }else {
                    System.out.println("Pacientul nu poate sa fie pus in acel pat deoarece este ocupat");
                }
            }else {
                System.out.println("Pacientul nu are trimiterea de la medic");
            }
        }
        else{
            System.out.println("Pacientul nu poate sa fie internat pentru ca nu e grav");
        }
    }

    public SpitalFacade(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }
}
