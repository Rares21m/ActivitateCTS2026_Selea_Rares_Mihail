package STRATEGY_1.clase;

public class LivrareExpres implements IModLivrare{
    @Override
    public void livrare(String numeProdus, double pretBaza) {
        System.out.println("Coletul"+numeProdus+" va ajunge in 24 ore si are pretul"+(pretBaza+25));
    }
}
