package PROXY_2.clase;

public class ProcesatorPlata implements IPlata{

    @Override
    public void proceseazaPlata(double suma, double soldCard) {
        System.out.println("Plata de "+suma+" a fost procesata");
    }
}
