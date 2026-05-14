package COMMAND_1.clase;

public class ComandaDepunere implements ICommand{
    private ContBancar cont;
    private double suma;

    public ComandaDepunere(ContBancar cont, double suma) {
        this.cont = cont;
        this.suma = suma;
    }

    @Override
    public void executa() {
        cont.depunere(suma);
    }
}
