package FACADE_02.clase;

public class SistemBratari {
    public boolean areStoc(String tip){
        if(tip.equalsIgnoreCase("Common")){
            return true;
        }
        return false;
    }
}
