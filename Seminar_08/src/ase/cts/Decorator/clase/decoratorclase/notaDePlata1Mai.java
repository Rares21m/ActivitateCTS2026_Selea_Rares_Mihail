package ase.cts.Decorator.clase.decoratorclase;

import ase.cts.Decorator.clase.NotaDePlataAbstract;

public class notaDePlata1Mai extends NotaDePlataDecorator{
    public notaDePlata1Mai(NotaDePlataAbstract notaDePlata) {
        super(notaDePlata);
    }


    @Override
    public void printeazaFelicitare() {
        System.out.println("Sanatate numai bile de 1 Mai!");
    }
}
