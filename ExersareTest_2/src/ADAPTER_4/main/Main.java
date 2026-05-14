package ADAPTER_4.main;

import ADAPTER_4.clase.AdapterCarteAntica;
import ADAPTER_4.clase.GestiunePublicatii;

import java.lang.reflect.GenericSignatureFormatError;

public class Main {
    public static void main(String[] args) {
        GestiunePublicatii carte=new AdapterCarteAntica();

        carte.afiseazaDetalii();
    }
}
