package COMMAND_STB.clase;

import COMMAND_1.clase.ICommand;

import java.util.ArrayList;
import java.util.List;

public class OperatorAutobuz {
    private List<IComanda> listaComenzi;

    public OperatorAutobuz() {
        this.listaComenzi = new ArrayList<>();
    }

    public void adaugaComanda(IComanda command){
        listaComenzi.add(command);
    }

    public void lanseazaComanda(){
        for(IComanda comand:listaComenzi){
            comand.executa();
        }
        listaComenzi.clear();
    }
}
