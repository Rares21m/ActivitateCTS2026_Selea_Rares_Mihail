package OBSERVER_1.main;

import OBSERVER_1.clase.Client;
import OBSERVER_1.clase.IMagazin;
import OBSERVER_1.clase.IObserver;
import OBSERVER_1.clase.MagazinOnline;

public class Main {
    public static void main(String[] args) {
        IObserver client1=new Client("Marian");
        IObserver client2=new Client("Maria");

        IMagazin magazin=new MagazinOnline("Altex");

        magazin.aboneazaPacient(client1);
        magazin.aboneazaPacient(client2);
        ((MagazinOnline)magazin).anuntaReduceri(15);
    }
}
