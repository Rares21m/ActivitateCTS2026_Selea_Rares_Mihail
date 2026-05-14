package COMMAND_1.clase;

public class ComandaRetragere implements ICommand{
    private ContBancar cont;
    private double suma;

    public ComandaRetragere(double suma, ContBancar cont) {
        this.suma = suma;
        this.cont = cont;
    }

    @Override
    public void executa() {
        cont.retragere(suma);
    }
}
