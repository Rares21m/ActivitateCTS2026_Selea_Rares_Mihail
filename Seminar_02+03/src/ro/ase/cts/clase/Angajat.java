package ro.ase.cts.clase;

import java.util.Arrays;


public class Angajat extends Aplicant {
    private String ocupatie;
    private int salariu;
    private static float sumaFinantare = 10;


    public static float getSumaFinantare() {
        return sumaFinantare;
    }

    public static void setSumaFinantare(float sumaFinantare) {
        Angajat.sumaFinantare = sumaFinantare;
    }

    public void setOcupatie(String ocupatie) {
        this.ocupatie = ocupatie;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    public Angajat() {
        super();

    }


    @Override
    public String toString() {
        StringBuilder sbAngajat=new StringBuilder("Angajatul {");
        sbAngajat.append(super.toString());
        sbAngajat.append(" ocupatie ");
        sbAngajat.append(" salariu ");
        sbAngajat.append(this.salariu);
        sbAngajat.append("}");
        return sbAngajat.toString();
    }


    public void afisareVenit() {
        System.out.println("Angajatul " + getNume() + " " + getPrenume() + " primeste" + Angajat.sumaFinantare + " Euro/zi in proiect.");
    }

}
