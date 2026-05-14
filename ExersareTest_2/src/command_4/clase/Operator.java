package command_4.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<IComanda> listaComenzi=new ArrayList<>();

    public void primesteComanda(IComanda comanda){
        listaComenzi.add(comanda);
    }

    public void trimiteExecutare(){
        if(listaComenzi.size()>0){
            listaComenzi.get(0).executa();
            listaComenzi.remove(0);
        }
    }

}
