package SimpleFactoryExersare3;

import Factory.clase.mijlocDeTransport.SimpleFactory.Factory;

public class Main {
    public static void main(String[] args) {
        FactoryCaracter fabricaCaracter=new FactoryCaracter();
        Caracter vrajitor= fabricaCaracter.getCaracter(TipCaracter.MAGE,"Mihai",20);
        vrajitor.descriere();

        Caracter warrior=fabricaCaracter.getCaracter(TipCaracter.WARRIOR,"DARK VADER",453);
        warrior.descriere();
    }
}
