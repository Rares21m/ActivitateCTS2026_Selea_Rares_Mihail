package ase.cts.Decorator.clase.decoratorclase;

import ase.cts.Decorator.clase.NotaDePlataAbstract;

public abstract class NotaDePlataDecorator implements NotaDePlataAbstract {

    NotaDePlataAbstract notaDePlata;

    public NotaDePlataDecorator(NotaDePlataAbstract notaDePlata) {
        this.notaDePlata = notaDePlata;
    }

    @Override
    public void printeaza() {
        notaDePlata.printeaza();
    }


    public abstract void printeazaFelicitare();
}
