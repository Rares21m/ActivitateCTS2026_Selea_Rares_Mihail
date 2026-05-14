package Restaurant_B9_PROXY.main;

import Restaurant_B9_PROXY.clase.FiltruRezervare;
import Restaurant_B9_PROXY.clase.IRezervare;
import Restaurant_B9_PROXY.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        IRezervare rezervare=new Rezervare("Marius","20:30");

        IRezervare verificaRezervare=new FiltruRezervare(rezervare);

        verificaRezervare.ralizareRezervare(6);
        verificaRezervare.ralizareRezervare(2);
    }
}
