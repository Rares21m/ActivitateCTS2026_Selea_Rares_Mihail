package ExersareBuilder2.Main;

import ExersareBuilder2.Clase.Pacient;
import ExersareBuilder2.Clase.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        Pacient pacient=new PacientBuilder().build();
        System.out.println(pacient);

        Pacient pacient2=new PacientBuilder().setHasPatRabatabil(true).setHasPapuciDeCamera(true).build();
        System.out.println(pacient2);
    }
}
