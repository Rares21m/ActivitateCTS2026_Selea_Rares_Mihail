package ase.cts.Adapter.aplicatie_spital;

public class MedicamentSpital {
    public void achizitioneazaMedicament(){
        System.out.println(
                this.prezintaReteta() ? "Medicament achizitionat" : "Nu are reteta valida"
        );
    }

    protected boolean prezintaReteta(){
        System.out.println("Clientul are reteta pentru acest medicament");
        return true;
    }


}
