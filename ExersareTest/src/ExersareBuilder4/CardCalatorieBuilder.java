package ExersareBuilder4;

import javax.smartcardio.Card;

public class CardCalatorieBuilder implements ICardCalatorie {
    private String numeTitular;
    private TipCard tipCard;
    private boolean areAbonamentActiv;
    private int nrCalatorii;
    private int valabilitateZile;
    private boolean permiteTransportMetrou;

    public CardCalatorieBuilder() {
        this.areAbonamentActiv = false;
        this.nrCalatorii = 0;
        this.valabilitateZile = 30;
        this.permiteTransportMetrou = false;
    }



    public CardCalatorieBuilder setNumeTitular(String numeTitular) {
        this.numeTitular = numeTitular;
        return this;
    }

    public CardCalatorieBuilder setTipCard(TipCard tipCard) {
        this.tipCard = tipCard;
        return this;
    }

    public CardCalatorieBuilder setAreAbonamentActiv(boolean areAbonamentActiv) {
        this.areAbonamentActiv = areAbonamentActiv;
        return this;
    }

    public CardCalatorieBuilder setNrCalatorii(int nrCalatorii) {
        this.nrCalatorii = nrCalatorii;
        return this;
    }

    public CardCalatorieBuilder setValabilitateZile(int valabilitateZile) {
        this.valabilitateZile = valabilitateZile;
        return this;
    }

    public CardCalatorieBuilder setPermiteTransportMetrou(boolean permiteTransportMetrou) {
        this.permiteTransportMetrou = permiteTransportMetrou;
        return this;
    }

    @Override
    public CardCalatorie build() {
        return new CardCalatorie(numeTitular, tipCard, areAbonamentActiv, nrCalatorii,
                valabilitateZile, permiteTransportMetrou);
    }
}
