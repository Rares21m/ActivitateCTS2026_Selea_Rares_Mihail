package RESTAURANT_B8_COMPOSITE.clase;

public class ItemMeniu extends ElementeMeniu{
   private String nume;
   private double pret;

    public ItemMeniu(String nume, double pret) {
        this.nume = nume;
        this.pret = pret;
    }

    @Override
    public void afiseazaDetalii(String indentare) {
        System.out.println(indentare+" PRODUSUL: "+this.nume+" PRET: "+this.pret);
    }
}
