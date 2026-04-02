package ExersareBuilder4;

public class CardCalatorie {
    private String numeTitular;
    private TipCard tipCard;
    private boolean areAbonamentActiv;
    private int nrCalatorii;
    private int valabilitateZile;
    private boolean permiteTransportMetrou;


    public CardCalatorie(String numeTitular, TipCard tipCard,boolean areAbonamentActiv, int nrCalatorii, int valabilitateZile, boolean permiteTransportMetrou) {
        this.numeTitular = numeTitular;
        this.tipCard = tipCard;
        this.areAbonamentActiv=areAbonamentActiv;
        this.nrCalatorii = nrCalatorii;
        this.valabilitateZile = valabilitateZile;
        this.permiteTransportMetrou = permiteTransportMetrou;
    }


    public String getNumeTitular() {
        return numeTitular;
    }

    public void setNumeTitular(String numeTitular) {
        this.numeTitular = numeTitular;
    }

    public TipCard getTipCard() {
        return tipCard;
    }

    public void setTipCard(TipCard tipCard) {
        this.tipCard = tipCard;
    }

    public int getNrCalatorii() {
        return nrCalatorii;
    }

    public void setNrCalatorii(int nrCalatorii) {
        this.nrCalatorii = nrCalatorii;
    }

    public int getValabilitateZile() {
        return valabilitateZile;
    }

    public void setValabilitateZile(int valabilitateZile) {
        this.valabilitateZile = valabilitateZile;
    }

    public boolean isPermiteTransportMetrou() {
        return permiteTransportMetrou;
    }

    public void setPermiteTransportMetrou(boolean permiteTransportMetrou) {
        this.permiteTransportMetrou = permiteTransportMetrou;
    }

    public boolean isAreAbonamentActiv() {
        return areAbonamentActiv;
    }

    public void setAreAbonamentActiv(boolean areAbonamentActiv) {
        this.areAbonamentActiv = areAbonamentActiv;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CardCalatorie{");
        sb.append("numeTitular='").append(numeTitular).append('\'');
        sb.append(", tipCard=").append(tipCard);
        sb.append(", nrCalatorii=").append(nrCalatorii);
        sb.append(", valabilitateZile=").append(valabilitateZile);
        sb.append(", permiteTransportMetrou=").append(permiteTransportMetrou);
        sb.append('}');
        return sb.toString();
    }

}
