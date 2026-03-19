package cts.ase.main;

import cts.ase.clase.FelDeMancare;
import cts.ase.clase.Supa;
import cts.ase.clase.SupaCrema;
import cts.ase.fabrici.*;

public class Main {
    public static void main(String[] args) {
        FelDeMancareFabrica fabrica=new SupaFabrica();
        FelDeMancare supaCrema=fabrica.getFelDeMancare(TipSupa.SUPA_CREMA,300,"Supa de morcovi");
        FelDeMancare ciorba=fabrica.getFelDeMancare(TipSupa.CIORBA,280,"ciorba de burta");

        FelDeMancareFabrica fabrica1=new DesertFabrica();
        FelDeMancare papanas=fabrica1.getFelDeMancare(TipDesert.PAPANAS,300,"papanas cu gem",340);
        FelDeMancare clatite=fabrica1.getFelDeMancare(TipDesert.CLATITE,534," clatite cu nutella");

        supaCrema.afiseazaPret();
        ciorba.afiseazaPret();
        papanas.afiseazaPret();
        clatite.afiseazaPret();
    }
}
