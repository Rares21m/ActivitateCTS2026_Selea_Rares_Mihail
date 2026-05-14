package Observer_4.clase;

public class Pacient implements IPacient{
    private String nume;

    public Pacient(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificarea(String mesaj) {
        System.out.println("PACIENT :"+this.nume+" A PRIMIT MESAJUL:"+mesaj);
    }
}
