package FACADE_01.clase;

public class Amplificator {
    private int nrHerz;

    public void porneste(){
        System.out.println("Proiectorul o sa porneasca");
    }

    public void setVolum(int volum){
        System.out.println("Volumul a fost setat la pragul de : "+volum);
    }

    public void setInputDVD(){
        System.out.println("Sistemul este acum pe modul de DVD");
    }
}
