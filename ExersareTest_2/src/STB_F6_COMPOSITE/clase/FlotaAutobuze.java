package STB_F6_COMPOSITE.clase;

import java.util.ArrayList;
import java.util.List;

public class FlotaAutobuze extends NodStructura{
    private String nume;
    private List<NodStructura> listaNoduri;

    public FlotaAutobuze(String nume) {
        this.nume = nume;
        this.listaNoduri = listaNoduri=new ArrayList<>();
    }

    @Override
    public void adaugaNod(NodStructura nod) {
        listaNoduri.add(nod);
    }

    @Override
    public void stergeNod(NodStructura nod) {
        listaNoduri.remove(nod);
    }

    @Override
    public NodStructura getNod(int i) {
        return listaNoduri.get(i);
    }

    @Override
    public void afiseazaDetalii(String indentare) {
        System.out.println(indentare+"NUME: "+this.nume);
        for(NodStructura nod:listaNoduri){
            nod.afiseazaDetalii(indentare+ " ");
        }
    }
}
