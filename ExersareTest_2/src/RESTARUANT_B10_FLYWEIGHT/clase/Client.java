package RESTARUANT_B10_FLYWEIGHT.clase;

import java.sql.SQLOutput;

public class Client implements IRezervare{
    private String nume;
    private String email;


    public Client(String nume, String email) {
        this.nume = nume;
        this.email = email;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void efectueazaRezervarea(Rezervare rezervare) {
        System.out.println(this.toString()+" "+rezervare.toString());
    }
}
