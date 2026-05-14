package command_4.main;

import command_4.clase.ComandaInternare;
import command_4.clase.ComandaTratareImediata;
import command_4.clase.Medic;
import command_4.clase.Operator;

public class Main {
    public static void main(String[] args) {
        Medic medic=new Medic("Andrei","ORTOPEDIE");
        Operator operator=new Operator();

        operator.primesteComanda(new ComandaInternare(medic,"Ionescu"));
        operator.primesteComanda(new ComandaTratareImediata(medic,"Popescu"));


        operator.trimiteExecutare();
        operator.trimiteExecutare();
        operator.trimiteExecutare();


    }
}
