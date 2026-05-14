package FLYWEEIGHT_1.clase;

import java.util.HashMap;

public class SimbolFactory {
    private HashMap<String,ISimbol> listaSimboluri;

    public SimbolFactory() {
        this.listaSimboluri = new HashMap<>();
    }

    public ISimbol getSimbol(String tipSimbol){
        if(listaSimboluri.containsKey(tipSimbol)){
            return listaSimboluri.get(tipSimbol);
        }
        else {
            ISimbol simbolNou=new SimbolConcret(tipSimbol,"EKG");
            listaSimboluri.put(tipSimbol,(SimbolConcret)simbolNou);
            return simbolNou;
        }
    }
}
