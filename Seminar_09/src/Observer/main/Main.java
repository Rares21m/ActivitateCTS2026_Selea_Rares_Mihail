package Observer.main;

import Observer.clase.ISpital;
import Observer.clase.Pacient;
import Observer.clase.PacientAbonat;
import Observer.clase.Spital;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1=new PacientAbonat("Ionescu",30);
        Pacient pacient2=new PacientAbonat("Popescu",40);
        Pacient pacient3=new PacientAbonat("Stanescu",50);

        ISpital spital=new Spital("Universitar");
        spital.aboneazaPacient(pacient1);
        spital.aboneazaPacient(pacient2);
        spital.aboneazaPacient(pacient3);

        ((Spital)spital).notificaVirus();
        System.out.println("---------------------------------------");
        ((Spital)spital).notificareEpidemie();

    }
}
