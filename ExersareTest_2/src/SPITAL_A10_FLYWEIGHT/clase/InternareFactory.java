package SPITAL_A10_FLYWEIGHT.clase;

import java.util.HashMap;

public class InternareFactory {
    private HashMap<String,IInternat> listaInternari;

    public InternareFactory() {
        this.listaInternari = new HashMap<>();
    }

    public IInternat getInternat(String nume){
        if(listaInternari.containsKey(nume)){
            return listaInternari.get(nume);
        }
        else{
            IInternat internare=new Pacient(nume,"075683456");
            listaInternari.put(nume,((IInternat) internare));
            return internare;
        }
    }
}
