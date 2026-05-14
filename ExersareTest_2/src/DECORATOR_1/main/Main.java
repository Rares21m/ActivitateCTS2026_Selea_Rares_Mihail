package DECORATOR_1.main;

import DECORATOR_1.clase.Bilet;
import DECORATOR_1.clase.IBilet;
import DECORATOR_1.clase.PopcornConcret;

public class Main {
    public static void main(String[] args) {
        IBilet biletSimplu=new Bilet("Avatar",23.4);

        IBilet biletCuPopCorn=new PopcornConcret(biletSimplu);

        biletCuPopCorn.afiseazaDetalii();
        biletSimplu.afiseazaDetalii();
    }
}
