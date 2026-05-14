package ADAPTER_4.clase;

public class AdapterCarteAntica extends ArhivaCartiAntice implements GestiunePublicatii{


    @Override
    public void afiseazaDetalii() {
        super.prezintaInformatiiAntice("Abracadabra");
    }
}
