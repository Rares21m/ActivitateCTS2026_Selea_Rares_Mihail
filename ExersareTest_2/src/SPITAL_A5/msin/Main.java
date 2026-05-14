package SPITAL_A5.msin;

import SPITAL_A5.clase.MedicamentAdapter;
import SPITAL_A5.clase.MedicamentFarmacie2;
import SPITAL_A5.clase.MedicamentSpital2;

public class Main {
    public static void main(String[] args) {
        MedicamentSpital2 medicamentSpital=new MedicamentSpital2();

        MedicamentFarmacie2 adapter=new MedicamentAdapter(medicamentSpital);

        adapter.cumparaMediament();
    }
}
