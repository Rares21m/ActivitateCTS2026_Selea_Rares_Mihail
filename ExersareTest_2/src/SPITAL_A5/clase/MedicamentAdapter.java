package SPITAL_A5.clase;

public class MedicamentAdapter extends MedicamentFarmacie2{
    private MedicamentSpital2 medicamentSpital;

    public MedicamentAdapter(MedicamentSpital2 medicamentSpital) {
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMediament() {
        super.cumparaMediament();
        medicamentSpital.achizitioneazaMedicament();
    }
}
