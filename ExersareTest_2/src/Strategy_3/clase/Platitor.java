package Strategy_3.clase;

public class Platitor {
    private String nume;
    private IModPlata modPlata;

    public Platitor(String nume) {
        this.nume = nume;
    }

    public void setModPlata(IModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void efectueazaPlata(double suma){
        if(modPlata!=null){
            System.out.println("NUME :"+this.nume);
            modPlata.plateste(suma);
        }else{
            System.out.println("Nu a fost selectata  un mode de plata");
        }
    }
}
