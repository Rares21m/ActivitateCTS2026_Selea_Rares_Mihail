package cts.ase.fabrici;

import cts.ase.clase.Clatite;
import cts.ase.clase.FelDeMancare;
import cts.ase.clase.Papanas;

public class DesertFabrica implements FelDeMancareFabrica{
    @Override
    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, float gramaj, String denumire, int calorii) {
        switch(tip){
            case TipDesert.PAPANAS:
                return new Papanas(gramaj,denumire,calorii);
            case TipDesert.CLATITE:
                return new Clatite(gramaj,denumire,calorii);
            default:
                return null;
        }
    }

    @Override
    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, float gramaj, String denumire) {
        return this.getFelDeMancare(tip,gramaj,denumire,500);
    }
}
