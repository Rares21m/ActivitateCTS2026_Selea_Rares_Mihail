package Command.clase;

public class Autobuz {
    private String producator;

    public Autobuz(String producator) {
        this.producator = producator;
    }
    //Command Strategy Oberver
    public void pleacaPeTraseu(int numarLinie) {
        System.out.println("Autbobuzul " + this.producator + " porneste pe traseul " + numarLinie);
    }
}
