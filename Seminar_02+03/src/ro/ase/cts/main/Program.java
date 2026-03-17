package ro.ase.cts.main;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;
import ro.ase.cts.clase.readers.ReaderAngajati;
import ro.ase.cts.clase.readers.ReaderAplicanti;

import java.io.FileNotFoundException;
import java.util.List;


public class Program {

    public static void main(String[] args) {
        List<Aplicant> listaAngajati;
        Aplicant.setPragPunctaj(85);
        try {
//			listaAngajati=new ReaderAngajati().readAplicanti("angajati.txt");
            //Este o varianta in regula dar daca vreau sa citesc din mai multe fisiere trebuie sa declar mai multe readere
//			Mai multe obiecte de tip reader
//

            ReaderAplicanti ra = new ReaderAngajati("angajati.txt");
            listaAngajati = ra.readAplicanti();
            for (Aplicant aplicant : listaAngajati) {
                System.out.println(aplicant.toString());
                aplicant.afisareVenit();
                aplicant.afisareStatut();
            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
