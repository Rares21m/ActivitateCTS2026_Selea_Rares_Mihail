package STRATEGY_1.clase;

public class RidicarePersonala implements IModLivrare{
    @Override
    public void livrare(String numeProdus, double pretBaza) {
        System.out.println("Clientul vine la sediu si plateste doar "+pretBaza);
    }
}
