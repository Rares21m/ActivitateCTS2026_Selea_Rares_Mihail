package SingletonNou;

public class ConexiuneBD {
    protected String conexiune;
    protected int nrSiguranta;

    private static ConexiuneBD instanta=null;

    private ConexiuneBD(String conexiune, int nrSiguranta) {
        this.conexiune = conexiune;
        this.nrSiguranta = nrSiguranta;
    }

    public String getConexiune() {
        return conexiune;
    }

    public void setConexiune(String conexiune) {
        this.conexiune = conexiune;
    }

    public int getNrSiguranta() {
        return nrSiguranta;
    }

    public void setNrSiguranta(int nrSiguranta) {
        this.nrSiguranta = nrSiguranta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ConexiuneBD{");
        sb.append("conexiune='").append(conexiune).append('\'');
        sb.append(", nrSiguranta=").append(nrSiguranta);
        sb.append('}');
        return sb.toString();
    }

    public static synchronized ConexiuneBD getInstanta(String conexiune,int nrSiguranta){
        if(instanta==null){
            instanta=new ConexiuneBD(conexiune,nrSiguranta);
        }
        return instanta;
    }
}
