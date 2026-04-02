package ExersareSingleton.Main;

import ExersareSingleton.Clae.Configuratie;

public class Main {
    public static void main(String[] args) {
        Configuratie instance=Configuratie.getInstanta("admin","open",4);
        System.out.println(instance);
        Configuratie instance2=Configuratie.getInstanta("asfd","dfs",5);
        System.out.println(instance2);
    }
}
