package STRATEGY_1.clase;

public class Comanda {
    private String numeProdus;
    private double pretBaza;
    private IModLivrare modLivrare;

    public Comanda(String numeProdus, double pretBaza) {
        this.numeProdus = numeProdus;
        this.pretBaza = pretBaza;
    }

    public void setModLivrare(IModLivrare modLivrare){
        this.modLivrare=modLivrare;
    }

    public void platesteComanda(){
        if(modLivrare!=null){
            modLivrare.livrare(numeProdus,pretBaza);
        }
        else{
            System.out.println("Selecteaza un mode de livrare!");
        }
    }
}
