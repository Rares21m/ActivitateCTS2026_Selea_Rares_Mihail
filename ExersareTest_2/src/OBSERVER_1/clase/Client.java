package OBSERVER_1.clase;

public class Client implements IObserver{
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesajl) {
        System.out.println("Clientul cu numele "+this.nume+" a primit mesajul: "+mesajl);
    }
}
