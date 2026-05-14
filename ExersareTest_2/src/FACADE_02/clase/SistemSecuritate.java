package FACADE_02.clase;

public class SistemSecuritate {
    public boolean estePeListaNeagra(String nume){
        if(nume.equalsIgnoreCase("Gigel")){
            return true;
        }
        return false;
    }
}
