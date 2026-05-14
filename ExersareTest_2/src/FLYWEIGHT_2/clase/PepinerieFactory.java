package FLYWEIGHT_2.clase;

import COMPOSITE_02.clase.IComponenta;

import java.util.HashMap;

public class PepinerieFactory {
    private HashMap<String,ModelCopac > listaCopaci;

    public PepinerieFactory() {
        this.listaCopaci = new HashMap<>();
    }

    public ICopac getCopac(String numeCopac){
        if(listaCopaci.containsKey(numeCopac)){
            return listaCopaci.get(numeCopac);
        }else {
            ICopac copac=new ModelCopac(numeCopac,"Texturat");
            listaCopaci.put(numeCopac,(ModelCopac) copac);
            return copac;
        }
    }
}
