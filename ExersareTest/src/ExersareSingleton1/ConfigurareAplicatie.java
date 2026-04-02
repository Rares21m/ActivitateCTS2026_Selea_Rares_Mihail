package ExersareSingleton1;

import ExersareSingleton.Clae.Configuratie;

public class ConfigurareAplicatie {
    private String limba;
    private int nrMaxCamere;
    private String modFunctionare;

    private static ConfigurareAplicatie instance=null;


    private ConfigurareAplicatie(String limba, int nrMaxCamere, String modFunctionare) {
        this.limba = limba;
        this.nrMaxCamere = nrMaxCamere;
        this.modFunctionare = modFunctionare;
    }

    public String getLimba() {
        return limba;
    }

    public void setLimba(String limba) {
        this.limba = limba;
    }

    public int getNrMaxCamere() {
        return nrMaxCamere;
    }

    public void setNrMaxCamere(int nrMaxCamere) {
        this.nrMaxCamere = nrMaxCamere;
    }

    public String getModFunctionare() {
        return modFunctionare;
    }

    public void setModFunctionare(String modFunctionare) {
        this.modFunctionare = modFunctionare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ConfigurareAplicatie{");
        sb.append("limba='").append(limba).append('\'');
        sb.append(", nrMaxCamere=").append(nrMaxCamere);
        sb.append(", modFunctionare='").append(modFunctionare).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static synchronized ConfigurareAplicatie getInstance(String limba, int nrMaxCamere, String modFunctionare){
        if(instance==null){
            instance=new ConfigurareAplicatie(limba,nrMaxCamere,modFunctionare);
        }
        return instance;
    }
}
