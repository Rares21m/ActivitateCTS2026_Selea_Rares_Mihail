package STRATEGY_1.main;

import STRATEGY_1.clase.Comanda;
import STRATEGY_1.clase.LivrareExpres;
import STRATEGY_1.clase.LivrareStandard;

public class Main {
    public static void main(String[] args) {
        Comanda comanda=new Comanda("Laptop",2453);
        comanda.platesteComanda();
        comanda.setModLivrare(new LivrareExpres());
        comanda.platesteComanda();
    }
}
