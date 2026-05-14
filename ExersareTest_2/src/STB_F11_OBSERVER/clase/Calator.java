package STB_F11_OBSERVER.clase;

public class Calator implements ICalator{
    private String nume;

    public Calator(String nume) {
        this.nume = nume;
    }


    @Override
    public void primesteNotificarea(String mesaj) {
        System.out.println(mesaj+ " SA NU UITATI!");
    }
}
