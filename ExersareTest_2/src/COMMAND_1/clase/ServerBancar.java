package COMMAND_1.clase;

import java.util.ArrayList;
import java.util.List;

public class ServerBancar {

    private List<ICommand>listaComnezi=new ArrayList<>();

    public void primesteComanda(ICommand comanda){
        listaComnezi.add(comanda);
    }

    public void trimiteSpreExecutie(){
        if(listaComnezi.size()>0){
            listaComnezi.get(0).executa();
            listaComnezi.remove(0);
        }
    }

}
