package Composite_1.clase;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;

public class Departament implements IStructura {
    private String nume;
    private List<IStructura> structuriSpital;

    public Departament(String nume) {
        this.nume = nume;
        this.structuriSpital = new ArrayList<>();
    }

    public void adaugaStructura(IStructura structura){
        structuriSpital.add(structura);
    }

    public void stergeStructura(IStructura structura){
        structuriSpital.remove(structura);
    }

    @Override
    public void AfiseazaStructura(String indentare) {
        System.out.println(indentare+" Nume dep "+this.nume);
        for(IStructura structura:structuriSpital){
            structura.AfiseazaStructura(indentare+"   ");
        }
    }
}
