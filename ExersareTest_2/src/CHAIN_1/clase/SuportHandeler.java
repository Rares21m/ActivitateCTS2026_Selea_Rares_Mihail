package CHAIN_1.clase;

public abstract class SuportHandeler {

    protected SuportHandeler succesor;

    public SuportHandeler() {
        this.succesor = null;
    }

    public void setSuccesor(SuportHandeler succesor) {
        this.succesor = succesor;
    }

    public abstract String recomandareSuport(int dificultate);
}
