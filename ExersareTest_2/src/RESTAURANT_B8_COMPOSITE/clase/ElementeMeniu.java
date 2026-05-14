package RESTAURANT_B8_COMPOSITE.clase;


public abstract class ElementeMeniu {
    public void adaugaElement(ElementeMeniu element) {
        throw new UnsupportedOperationException();
    }

    public void stergeElement(ElementeMeniu element) {
        throw new UnsupportedOperationException();
    }

    public ElementeMeniu getElement(int pozitie){
        throw new UnsupportedOperationException();
    }

    public abstract void afiseazaDetalii(String indentare);
}
