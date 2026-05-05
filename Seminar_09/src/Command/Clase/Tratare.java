package Command.Clase;

public class Tratare implements Command{
    private PersonalSpital asistenta;

    private Pacient pacient;

    public Tratare(Pacient pacient, PersonalSpital asistenta) {
        this.pacient = pacient;
        this.asistenta = asistenta;
    }

    @Override
    public void executa() {
        asistenta.preluarePacient(pacient);

    }
}
