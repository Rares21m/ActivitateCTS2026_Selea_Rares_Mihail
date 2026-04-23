package ase.cts.main;

import ase.cts.Facade.Clase.Medic;
import ase.cts.Facade.Clase.Pacient;
import ase.cts.Facade.Clase.Salon;
import ase.cts.Adapter.aplicatie_farmacie.AdaptorMedicamentSpital;
import ase.cts.Adapter.aplicatie_farmacie.MedicamentFarmacie;
import ase.cts.Adapter.aplicatie_spital.MedicamentSpital;
import ase.cts.Facade.Implementare.SpitalFacade;
import ase.cts.Proxy.Clase.PacientP;
import ase.cts.Proxy.Clase.SpitaL;

public class Main {
    public static void realizeazaAchizitie(MedicamentFarmacie medicamentFarmacie){
        medicamentFarmacie.cumparaMedicament();
    }
    public static void main(String[] args) {
//        Scoatem de la lucrarea a2a TEMPO MEMENTO SI STATE
//        Strategy observer chain si comman
//        Daca avem 2 sisteme care trebui sa funtioneze impreuna folosim adapter
//        Adapter : de obiecte si de clase ( este de 2 tipuri)


//========================================ADAPTER============================================
        MedicamentSpital paracetamol=new MedicamentSpital();
        MedicamentFarmacie nurofen=new MedicamentFarmacie();

        paracetamol.achizitioneazaMedicament();
        nurofen.cumparaMedicament();


        AdaptorMedicamentSpital paracetamolAdapter=new AdaptorMedicamentSpital(paracetamol);
        realizeazaAchizitie(paracetamolAdapter);


//======================================FACADE====================================================
        Pacient pacient1=new Pacient(7,"Matei");
        Pacient pacient2=new Pacient(2,"Rares");
        Pacient pacient3=new Pacient(5,"Mihai");
        Pacient pacient4=new Pacient(8,"Mihaela");
        Medic medic=new Medic("Marian");
        Salon salon= Salon.getInstance();



        if(pacient1.getGravitate()>=3){
            if(medic.areBiletDeTriemitere(pacient1)){
                int nrPat=salon.existaPaturiLibere();
                if(salon.existaPaturiLibere()!=-1){
                    System.out.println("Pacientul "+pacient1.getNume()+" trebuie sa fie internat in patul "+nrPat);
                    salon.ocupaPat(nrPat);
                }
            }
        }

        SpitalFacade facade=new SpitalFacade(new Medic("Burca"),salon);
        facade.interneazaPacient(pacient2);
        facade.interneazaPacient(pacient3);
        facade.interneazaPacient(pacient4);

        System.out.println("======================================PROXY============================");
        PacientP pacient=new PacientP("Davies",true);
        SpitaL spitaL=new SpitaL("Judetean");


        spitaL.interneazaPacient(pacient);
    }
}