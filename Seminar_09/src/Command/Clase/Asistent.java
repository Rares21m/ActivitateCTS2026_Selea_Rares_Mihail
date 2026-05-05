package Command.Clase;

public class Asistent implements PersonalSpital{
    private String numeA;

    public Asistent(String numeA) {
        this.numeA = numeA;
    }

    @Override
    public void preluarePacient(Pacient pacient) {
        System.out.println("Asistentul "+this.numeA+" trateaza imediat pacientul  "+pacient.getNume());
    }
}
