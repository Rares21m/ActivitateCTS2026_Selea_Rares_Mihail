package RESTAURANT_B8_COMPOSITE.clase;

import java.util.ArrayList;
import java.util.List;

public class CategoriiMeniu extends ElementeMeniu{
    private String numeCat;
    private List<ElementeMeniu> listaElemente;

    public CategoriiMeniu(String numeCat) {
        this.numeCat = numeCat;
        this.listaElemente = new ArrayList<>();
    }

    @Override
    public void adaugaElement(ElementeMeniu element) {
        listaElemente.add(element);
    }

    @Override
    public void stergeElement(ElementeMeniu element) {
        listaElemente.remove(element);
    }

    @Override
    public ElementeMeniu getElement(int pozitie) {
        return listaElemente.get(pozitie);
    }

    @Override
    public void afiseazaDetalii(String indentare) {
        System.out.println("CATEGORIE: "+this.numeCat);
        for(ElementeMeniu element:listaElemente){
            element.afiseazaDetalii(indentare+"   ");
        }
    }
}
