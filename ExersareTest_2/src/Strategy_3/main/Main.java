package Strategy_3.main;

import Strategy_3.clase.IModPlata;
import Strategy_3.clase.PlataCard;
import Strategy_3.clase.Platitor;

public class Main {
    public static void main(String[] args) {
        Platitor platitor=new Platitor("Marian");
        platitor.setModPlata(new PlataCard());
        platitor.efectueazaPlata(200);
    }
}
