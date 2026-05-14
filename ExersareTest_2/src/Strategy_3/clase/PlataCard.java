package Strategy_3.clase;

public class PlataCard implements IModPlata{
    @Override
    public void plateste(double suma) {
        System.out.println("SUMA : "+suma+" va fi platita cu cardul");
    }
}
