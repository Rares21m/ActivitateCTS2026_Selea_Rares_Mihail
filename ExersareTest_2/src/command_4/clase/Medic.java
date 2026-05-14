package command_4.clase;

public class Medic {
    private String nume;
    private String specializare;

    public Medic(String nume, String specializare) {
        this.nume = nume;
        this.specializare = specializare;
    }

    public void interneaza(String pacient){
        System.out.println("Medicul"+this.nume+" interneaza pacientul "+pacient);
    }

    public void trateazaImediat(String pacitent){
        System.out.println("Medicul"+this.nume+" trateaza IMEDIAT pacientul "+pacitent);

    }
}
