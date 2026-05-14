package FACADE_02.clase;

import java.sql.SQLOutput;

public class SecuritateCompletaFacade {
    SistemBratari sistemBratari;
    SistemBilete sistemBilete;
    SistemSecuritate sistemSecuritate;

    public SecuritateCompletaFacade(SistemBratari sistemBratari, SistemBilete sistemBilete, SistemSecuritate sistemSecuritate) {
        this.sistemBratari = sistemBratari;
        this.sistemBilete = sistemBilete;
        this.sistemSecuritate = sistemSecuritate;
    }

    public void verificareAcces(Festivalier f) {
        // 1. Verificare Bilet
        if (!sistemBilete.esteValid(f.getCodBilet())) {
            System.out.println("REJECT: Biletul cod " + f.getCodBilet() + " nu este valid.");
            return; // SE OPREȘTE AICI. Nu mai execută restul de cod de mai jos.
        }
        System.out.println("CHECK: Bilet valid.");

        // 2. Verificare Securitate (ajungem aici doar dacă biletul a fost OK)
        if (sistemSecuritate.estePeListaNeagra(f.getNume())) {
            System.out.println("REJECT: " + f.getNume() + " este pe lista neagră!");
            return; // SE OPREȘTE AICI.
        }
        System.out.println("CHECK: Omul este în regulă.");

        // 3. Verificare Stoc (ajungem aici doar dacă primele două au trecut)
        if (!sistemBratari.areStoc(f.getTipBratara())) {
            System.out.println("REJECT: Nu avem stoc pentru brățări tip " + f.getTipBratara());
            return;
        }

        // FINAL: Dacă a ajuns aici, înseamnă că niciun 'return' de mai sus nu s-a activat
        System.out.println("SUCCES: Acces permis pentru " + f.getNume() + ". Distracție plăcută!");
    }
}
