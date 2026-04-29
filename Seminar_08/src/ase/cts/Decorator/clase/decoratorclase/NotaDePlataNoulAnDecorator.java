package ase.cts.Decorator.clase.decoratorclase;

import ase.cts.Decorator.clase.NotaDePlataAbstract;

public class NotaDePlataNoulAnDecorator extends NotaDePlataDecorator {

    public NotaDePlataNoulAnDecorator(NotaDePlataAbstract notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("La multi ani de anul nou! ");
    }
}
