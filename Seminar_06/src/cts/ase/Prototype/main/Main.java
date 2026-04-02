package cts.ase.Prototype.main;

import cts.ase.Prototype.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare=new Rezervare("Eze",21,3,"3444444444444444");
        Rezervare rezervare1=(Rezervare) rezervare.copiaza();


    }
}
