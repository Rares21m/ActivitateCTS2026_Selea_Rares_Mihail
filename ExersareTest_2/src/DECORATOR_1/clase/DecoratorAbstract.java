package DECORATOR_1.clase;

public abstract class  DecoratorAbstract implements IBilet {
    protected IBilet biletDecorat;

    public DecoratorAbstract(IBilet biletDecorat) {
        this.biletDecorat = biletDecorat;
    }


    @Override
    public void afiseazaDetalii() {
            biletDecorat.afiseazaDetalii();
            System.out.println("Acestea sunt detaliile");
    }

    @Override
    public double getPret() {
        return biletDecorat.getPret();
    }
}
