package ExersareSingleton.Clae;

public class Configuratie {
    protected String nivelLogare;
    protected String modFunctionare;
    protected int limitaPacienti;

    private static Configuratie instanta=null;

    private Configuratie(String nivelLogare, String modFunctionare, int limitaPacienti) {
        this.nivelLogare = nivelLogare;
        this.modFunctionare = modFunctionare;
        this.limitaPacienti = limitaPacienti;
    }

    public String getNivelLogare() {
        return nivelLogare;
    }

    public void setNivelLogare(String nivelLogare) {
        this.nivelLogare = nivelLogare;
    }

    public String getModFunctionare() {
        return modFunctionare;
    }

    public void setModFunctionare(String modFunctionare) {
        this.modFunctionare = modFunctionare;
    }

    public int getLimitaPacienti() {
        return limitaPacienti;
    }

    public void setLimitaPacienti(int limitaPacienti) {
        this.limitaPacienti = limitaPacienti;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Configuratie{");
        sb.append("nivelLogare='").append(nivelLogare).append('\'');
        sb.append(", modFunctionare='").append(modFunctionare).append('\'');
        sb.append(", limitaPacienti=").append(limitaPacienti);
        sb.append('}');
        return sb.toString();
    }

    public static synchronized Configuratie getInstanta(String logare , String funtionare, int limita){
        if(instanta==null){
            instanta=new Configuratie(logare,funtionare,limita);
        }
        return instanta;
    }
}
