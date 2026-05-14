package ADAPTER_1.clase;

public class AdapterBanca implements IPos{

    BancaNoua bancaNoua;

    public AdapterBanca(BancaNoua bancaNoua) {
        this.bancaNoua = bancaNoua;
    }

    @Override
    public void platesteSuma(double suma) {
        bancaNoua.efectuarePlata((int) suma);
    }
}
