package ase.cts.Composite.Clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements Structura{
   private String nume;
   private List<Structura> substructuri;

    public Departament(String nume) {
        this.nume = nume;
        this.substructuri = new ArrayList<>();
    }

    public void adaugaStructura(Structura structura){
        substructuri.add(structura);
    }

    public void stergeStructura(Structura structura){
        substructuri.remove(structura);
    }

    public Structura getStructura(int pozitie){
        return substructuri.get(pozitie);
    }

    @Override
    public void afiseazaDetaliiStructura(String spatii) {
        System.out.println(spatii+"Nume dep "+this.nume);
        for(Structura structura : substructuri){
            structura.afiseazaDetaliiStructura(spatii+"    ");
        }
    }
}
