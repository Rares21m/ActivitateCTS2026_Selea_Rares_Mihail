package STB_F6_COMPOSITE.main;

import STB_F6_COMPOSITE.clase.Autobuz;
import STB_F6_COMPOSITE.clase.FlotaAutobuze;
import STB_F6_COMPOSITE.clase.NodStructura;

public class Main {
    public static void main(String[] args) {
        NodStructura flotaMare=new FlotaAutobuze("FLOTA MARE STB");

        NodStructura grupMici = new FlotaAutobuze("Grup Autobuze Mici (10 locuri)");
        NodStructura grupMedii = new FlotaAutobuze("Grup Autobuze Medii (30 locuri)");
        NodStructura grupMari = new FlotaAutobuze("Grup Autobuze Mari (50 locuri)");

        NodStructura a1 = new Autobuz("Mercedes", "Citaro Micro", 10);
        NodStructura a2 = new Autobuz("Fiat", "Ducato", 10);
        NodStructura a3 = new Autobuz("Otokar", "Kent 12", 30);
        NodStructura a4 = new Autobuz("MAN", "Lion's City", 50);


        flotaMare.adaugaNod(grupMici);
        flotaMare.adaugaNod(grupMedii);
        flotaMare.adaugaNod(grupMari);

        grupMici.adaugaNod(a1);
        grupMici.adaugaNod(a2);
        grupMedii.adaugaNod(a3);
        grupMari.adaugaNod(a4);

        flotaMare.afiseazaDetalii("");
    }
}
