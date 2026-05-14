package SPITAL_A5.clase;

public class MedicamentSpital2 {

   public void achizitioneazaMedicament(){
       System.out.println(this.prezintaReteta() ? "S a eliberat medicamentul pe baza retetei":"Medicamentul nu " +
               "poate fi achizitionat");
   }


    public boolean prezintaReteta(){
        System.out.println("Reteta a fost prezentata");
        return true;
    }

}
