package PROXY_2.clase;

public class ProxyPlata implements IPlata {
    private IPlata procesatorPlata;


    public ProxyPlata(IPlata procesatorPlata) {
        this.procesatorPlata = procesatorPlata;
    }

    @Override
    public void proceseazaPlata(double suma, double soldCard) {
        if(suma>0&& soldCard>=suma){
            procesatorPlata.proceseazaPlata(suma,soldCard);
        }
        else{
            System.out.println("Interzis nu se poate efectua procesarea platii");
        }
    }
}
