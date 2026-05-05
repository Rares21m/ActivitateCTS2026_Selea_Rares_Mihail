package Command.Main;

import Command.Clase.*;

public class Main {
    public static void main(String[] args) {
        PersonalSpital medic=new Medic("Popescu");
        PersonalSpital asistenta=new Asistent("Ene");

        Pacient pacient1=new Pacient("Marian");
        Pacient pacient2=new Pacient("Maria");
        Pacient pacient3=new Pacient("Marin");

        Command comanda1= new Internare(medic,pacient1);
        Command comanda2=new Tratare(pacient2, asistenta);


        Operator operator=new Operator();

        operator.inregistreaza(comanda1);
        operator.inregistreaza(comanda2);

        operator.executaFisa();


        operator.inregistreaza(new Tratare(new Pacient("Eminescu"),asistenta));
        operator.executaFisa();
        operator.executaFisa();


    }
}
