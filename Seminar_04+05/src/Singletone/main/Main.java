package Singletone.main;

import Singletone.clase.Logger;

public class Main {
    public static void main(String[] args) {
       Logger instance= Logger.getInstanta("Interfata", "afisare" );
       instance.afiseazaLog("fisierul json nu este afisat corect");
       instance.afiseazaLog("Eroare");

       Logger instance2=Logger.getInstanta("Backend","baza de date");
       instance2.afiseazaLog("eroare");
       instance2.setCategorie("baza de date");
       instance2.setSender("Backend");
       instance2.afiseazaLog("eroare la inserare");


       //Pentru lucrare Logger instance3= new Logger() pentru a verifica ca nu avem constructorul
        //public pentru ca daca ne ar lasa asta inseamna ca am facut ceva gresit la consturctor si e public
        //TREBUIE SA FIE PRIVAT
        //La test sunt acceptate fie threadSafe fie lazy initialization



    }
}