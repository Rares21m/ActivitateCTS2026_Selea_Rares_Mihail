package COMPOSITE_02.main;

import COMPOSITE_02.clase.CategorieProdus;
import COMPOSITE_02.clase.IComponenta;
import COMPOSITE_02.clase.Produs;

public class Main {
    public static void main(String[] args) {
        IComponenta Supermarket=new CategorieProdus("Carrefour");
        IComponenta Dulciuri=new CategorieProdus("Dulciuri");
        IComponenta Paine=new Produs("Paine",3.5);

        ((CategorieProdus) Supermarket).adaugaProdus(Paine);
        ((CategorieProdus) Supermarket).adaugaProdus(Dulciuri);


        Supermarket.afisare(" ");
        ((CategorieProdus) Supermarket).stergeProdus(Paine);
        Supermarket.afisare("    ");
    }
}
