package FLYWEIGHT_2.main;

import FLYWEIGHT_2.clase.ICopac;
import FLYWEIGHT_2.clase.PepinerieFactory;
import FLYWEIGHT_2.clase.PozitieCopac;

public class Main {
    public static void main(String[] args) {
        PozitieCopac p1 = new PozitieCopac(1, 1);
        PozitieCopac p2 = new PozitieCopac(2, 3);

        PepinerieFactory fabrica=new PepinerieFactory();
        ICopac copac=fabrica.getCopac("Stejar");
        copac.planteaza(p1);
        fabrica.getCopac("Fag").planteaza(p1);
    }
}
