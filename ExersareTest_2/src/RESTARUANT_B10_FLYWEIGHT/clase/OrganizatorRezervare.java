package RESTARUANT_B10_FLYWEIGHT.clase;

import DECORATOR_1.clase.DecoratorAbstract;

import java.util.HashMap;

public class OrganizatorRezervare {
    private HashMap<String,IRezervare> listaRezervari;

    public OrganizatorRezervare() {
        this.listaRezervari = new HashMap<>();
    }

    public IRezervare getRezervare(String nume){
        if(listaRezervari.containsKey(nume)){
            return listaRezervari.get(nume);
        }
        else{
            IRezervare rezervare=new Client(nume,"Rares21m@yahoo.com");
            listaRezervari.put(nume,((IRezervare) rezervare));
            return rezervare;

        }
    }
}
