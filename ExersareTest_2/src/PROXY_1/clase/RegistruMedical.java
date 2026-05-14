package PROXY_1.clase;

public class RegistruMedical implements IRegistru{


    @Override
    public void afiseazaDosar(Pacient p, Angajat utilizator) {
        System.out.println("Dosar :"+p.getIstoricMedical());
    }
}
