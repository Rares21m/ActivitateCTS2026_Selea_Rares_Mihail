package cts.ase.FactoryMethod.clase.fabrici;

import cts.ase.FactoryMethod.clase.Clatite;
import cts.ase.FactoryMethod.clase.FelDeMancare;
import cts.ase.FactoryMethod.clase.Papanas;

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
