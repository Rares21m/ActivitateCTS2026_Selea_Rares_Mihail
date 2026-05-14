package COMMAND_STB.clase;

import COMMAND_1.clase.ICommand;

public class ComandaConcreta implements IComanda {
    private int nrLinie;
    private Autobuz autobuz;

    public ComandaConcreta(int nrLinie, Autobuz autobuz) {
        this.nrLinie = nrLinie;
        this.autobuz = autobuz;
    }

    @Override
    public void executa() {
        autobuz.pleacaInTraseu(nrLinie);
    }
}
