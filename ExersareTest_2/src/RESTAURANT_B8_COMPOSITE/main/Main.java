package RESTAURANT_B8_COMPOSITE.main;

import RESTAURANT_B8_COMPOSITE.clase.CategoriiMeniu;
import RESTAURANT_B8_COMPOSITE.clase.ElementeMeniu;
import RESTAURANT_B8_COMPOSITE.clase.ItemMeniu;

public class Main {
    public static void main(String[] args) {
        CategoriiMeniu categorieMare=new CategoriiMeniu("MENIU");

        CategoriiMeniu bauturi=new CategoriiMeniu("BAUTURI");
        CategoriiMeniu deserturi=new CategoriiMeniu("DESERTURI");

        ItemMeniu frappe=new ItemMeniu("Frappe",20);
        ItemMeniu cappuchino=new ItemMeniu("Cappuchino",25);
        ItemMeniu clatite=new ItemMeniu("Clatite",30);
        ItemMeniu papanasi=new ItemMeniu("Papanasi",30);

        categorieMare.adaugaElement(bauturi);
        categorieMare.adaugaElement(deserturi);

        bauturi.adaugaElement(frappe);
        bauturi.adaugaElement(cappuchino);
        deserturi.adaugaElement(clatite);
        deserturi.adaugaElement(papanasi);

        categorieMare.afiseazaDetalii("");

    }
}
