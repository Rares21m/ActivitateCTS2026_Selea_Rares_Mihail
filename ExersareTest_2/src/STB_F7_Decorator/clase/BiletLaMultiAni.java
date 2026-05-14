package STB_F7_Decorator.clase;

public class BiletLaMultiAni extends DecoratorBilet{


    public BiletLaMultiAni(IBilet biletDecorat) {
        super(biletDecorat);
    }

    @Override
    public void afiseazaBilet() {
        super.afiseazaBilet();
        System.out.println("La multi ani de ziua noastraa!");
    }
}
