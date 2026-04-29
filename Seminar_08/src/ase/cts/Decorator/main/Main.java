package ase.cts.Decorator.main;

import ase.cts.Decorator.clase.NotaDePlata;
import ase.cts.Decorator.clase.NotaDePlataAbstract;
import ase.cts.Decorator.clase.decoratorclase.NotaDePlataDecorator;
import ase.cts.Decorator.clase.decoratorclase.NotaDePlataNoulAnDecorator;
import ase.cts.Decorator.clase.decoratorclase.notaDePlata1Mai;

public class Main {
    public static void main(String[] args) {

        NotaDePlataAbstract nota=new NotaDePlata("21.05.2026",2546);
        nota.printeaza();
        NotaDePlataDecorator notaPlataDecorator=null;
        int a=2;
        if(a==1){
            notaPlataDecorator=new NotaDePlataNoulAnDecorator(nota);
        }
        else {
            notaPlataDecorator=new notaDePlata1Mai(nota);
        }
        notaPlataDecorator.printeaza();
        notaPlataDecorator.printeazaFelicitare();



    }
}