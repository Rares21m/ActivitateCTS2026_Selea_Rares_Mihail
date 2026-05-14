package STB_F7_Decorator.clase;

import FLYWEIGHT_2.clase.ICopac;

public abstract class DecoratorBilet implements IBilet{
    private IBilet biletDecorat;

    public DecoratorBilet(IBilet biletDecorat) {
        this.biletDecorat = biletDecorat;
    }


    @Override
    public void afiseazaBilet() {
        biletDecorat.afiseazaBilet();
        System.out.println("KAKAKAKAK");
    }
}
