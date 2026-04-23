package ase.cts.Adapter.aplicatie_farmacie;

import ase.cts.Adapter.aplicatie_spital.MedicamentSpital;

public class AdaptorMedicamentSpital extends MedicamentFarmacie{
    MedicamentSpital medicamentSpital;


    public AdaptorMedicamentSpital(MedicamentSpital medicamentSpital) {
        this.medicamentSpital = medicamentSpital;
    }


    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();
    }
}
