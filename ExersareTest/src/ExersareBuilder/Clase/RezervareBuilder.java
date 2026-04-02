package ExersareBuilder.Clase;

public class RezervareBuilder implements RezervareBuilderAbstract {

    private boolean asezareGeam;
    private boolean scauneErgonomice;
    private boolean decorareaMesei;
    private boolean muzicaAmbientala;
    private String genMuzica;

    public RezervareBuilder() {
        this.asezareGeam = false;
        this.scauneErgonomice = false;
        this.decorareaMesei = false;
        this.muzicaAmbientala = false;
        this.genMuzica = null;
    }



    @Override
    public Rezervare build() {
        return new Rezervare(asezareGeam,scauneErgonomice,decorareaMesei,muzicaAmbientala,genMuzica);
    }


    public RezervareBuilder setAsezareGeam(boolean asezareGeam) {
        this.asezareGeam = asezareGeam;
        return this;
    }

    public RezervareBuilder setScauneErgonomice(boolean scauneErgonomice) {
        this.scauneErgonomice = scauneErgonomice;
        return this;
    }

    public RezervareBuilder setDecorareaMesei(boolean decorareaMesei) {
        this.decorareaMesei = decorareaMesei;
        return this;
    }

    public RezervareBuilder setMuzicaAmbientala(boolean muzicaAmbientala) {
        this.muzicaAmbientala = muzicaAmbientala;
        return this;

    }

    public RezervareBuilder setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
        return this;
    }
}
