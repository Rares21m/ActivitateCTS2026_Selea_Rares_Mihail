package STB_F5FACADE.main;

import STB_F5FACADE.clase.UsaFacade;
import STB_F5FACADE.clase.UsaFata;
import STB_F5FACADE.clase.UsaMijloc;
import STB_F5FACADE.clase.UsaSpate;

public class Main {
    public static void main(String[] args) {
        UsaFata usaFata=new UsaFata();
        UsaSpate usaSpate=new UsaSpate();
        UsaMijloc usaMijloc=new UsaMijloc();

        UsaFacade butonGeneral=new UsaFacade(usaFata,usaMijloc,usaSpate);

        butonGeneral.elibereazaUsile();
        butonGeneral.deschideFortat();
    }
}
