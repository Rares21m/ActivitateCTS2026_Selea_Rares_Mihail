package STRATEGY_1.clase;

public class LivrareStandard implements IModLivrare{
    @Override
    public void livrare(String numeProdus, double pretBaza) {
        System.out.println("Coletul"+numeProdus+" va ajunge in 5 zile si are pretul"+(pretBaza+15));
    }
}
