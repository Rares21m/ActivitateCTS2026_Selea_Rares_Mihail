package FACADE_02.clase;

public class SistemBilete {

    public boolean esteValid(String codBilet){
        return codBilet.startsWith("UNTOLD");
    }
}
