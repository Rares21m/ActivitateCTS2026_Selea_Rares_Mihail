package cts.ase.FactoryMethod.clase.fabrici;

import cts.ase.FactoryMethod.clase.FelDeMancare;

public interface FelDeMancareFabrica {
    public FelDeMancare getFelDeMancare(TipFelDeMancare tip,float gramaj,String denumire,int calorii);

    public FelDeMancare getFelDeMancare(TipFelDeMancare tip,float gramaj,String denumire);


}
