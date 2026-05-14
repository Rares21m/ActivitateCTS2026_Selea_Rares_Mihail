package DECORATOR_1.clase;

public class PopcornConcret extends DecoratorAbstract{
    public PopcornConcret(IBilet biletDecorat) {
        super(biletDecorat);
    }

    @Override
    public void afiseazaDetalii() {
        super.afiseazaDetalii();
        System.out.println("Bonus: Popcorn cu trufe inclus");
    }

    @Override
    public double getPret() {
        return super.getPret()+15;
    }
}
