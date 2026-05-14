package Observer_4.main;

import Observer_4.clase.INotificare;
import Observer_4.clase.IPacient;
import Observer_4.clase.NotificarePacienti;
import Observer_4.clase.Pacient;

public class Main {
    public static void main(String[] args) {
        IPacient pacient1=new Pacient("Maria");
        IPacient pacient2=new Pacient("Marian");
        IPacient pacient3=new Pacient("Ana");

        INotificare notificare=new NotificarePacienti();

        notificare.abonarePacient(pacient1);
        notificare.abonarePacient(pacient2);
        notificare.abonarePacient(pacient3);

        notificare.notificaPacienti("EXISTA UN NOU VIRUS IN ORAS");

        notificare.dezabonarePacient(pacient1);
        System.out.println("-----------------------------------");
        notificare.notificaPacienti("EXISTA O NOUA EPIDEMIE IN ORAS");


    }
}
