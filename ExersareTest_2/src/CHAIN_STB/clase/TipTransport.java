package CHAIN_STB.clase;

public abstract class TipTransport {
    private TipTransport succesor;

    public TipTransport(TipTransport succesor) {
        this.succesor = succesor;
    }

    public void setSuccesor(TipTransport succesor) {
        this.succesor = succesor;
    }

    public abstract String recomandareSuport(int distanta);
}
