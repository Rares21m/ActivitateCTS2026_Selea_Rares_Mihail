package COMPOSITE_02.clase;


import java.util.ArrayList;
import java.util.List;

public class CategorieProdus implements IComponenta {

    private String nume;
    private List<IComponenta> listaProduse;

    public CategorieProdus(String nume) {
        this.nume = nume;
        this.listaProduse = new ArrayList<>();
    }

    public void adaugaProdus(IComponenta produs){listaProduse.add(produs);}

    public void stergeProdus(IComponenta produs){
        listaProduse.remove(produs);
    }

    public IComponenta getProdus(int pozitie){
        return listaProduse.get(pozitie);
    }

    @Override
    public void afisare(String indentare) {
        System.out.println(indentare+"Nume categorie "+this.nume );
        for(IComponenta produs:listaProduse){
            produs.afisare(indentare+"   ");
        }
    }

    @Override
    public double calculeazaPretTotal() {
        double suma=0;
        for(IComponenta produs:listaProduse){
            suma+=produs.calculeazaPretTotal();
        }
        return suma;
    }
}
