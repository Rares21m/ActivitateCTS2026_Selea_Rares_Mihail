package ExersareBuilder.Main;

import ExersareBuilder.Clase.Rezervare;
import ExersareBuilder.Clase.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare = new RezervareBuilder()
                .setAsezareGeam(true)
                .setScauneErgonomice(true)
                .setDecorareaMesei(true)
                .setMuzicaAmbientala(true)
                .setGenMuzica("Jazz")
                .build();

        System.out.println(rezervare);

        Rezervare rezervare2 = new RezervareBuilder()
                .setScauneErgonomice(true)
                .build();

        System.out.println(rezervare2);
    }
}