package STB_F7_Decorator.main;

import STB_F7_Decorator.clase.Bilet;
import STB_F7_Decorator.clase.BiletLaMultiAni;
import STB_F7_Decorator.clase.IBilet;

public class Main {
    public static void main(String[] args) {
        IBilet bilet=new Bilet("df32",2);

        IBilet biletSpecial=new BiletLaMultiAni(bilet);

        biletSpecial.afiseazaBilet();
    }
}
