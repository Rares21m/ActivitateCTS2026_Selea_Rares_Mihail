package ExersareBuilder2.Clase;

public class PacientBuilder implements IBuilder {
    private boolean hasPatRabatabil;
    private boolean hasMicDejunInclus;
    private boolean hasPapuciDeCamera;
    private boolean hasHalatPentruInterior;

    public PacientBuilder() {
        this.hasPatRabatabil = false;
        this.hasMicDejunInclus = false;
        this.hasPapuciDeCamera = false;
        this.hasHalatPentruInterior = false;
    }


    public PacientBuilder setHasPatRabatabil(boolean hasPatRabatabil) {
        this.hasPatRabatabil = hasPatRabatabil;
        return this;
    }

    public PacientBuilder setHasMicDejunInclus(boolean hasMicDejunInclus) {
        this.hasMicDejunInclus = hasMicDejunInclus;
        return this;
    }

    public PacientBuilder setHasPapuciDeCamera(boolean hasPapuciDeCamera) {
        this.hasPapuciDeCamera = hasPapuciDeCamera;
        return this;
    }

    public PacientBuilder setHasHalatPentruInterior(boolean hasHalatPentruInterior) {
        this.hasHalatPentruInterior = hasHalatPentruInterior;
        return this;
    }

    @Override
    public Pacient build() {
        return new Pacient(hasPatRabatabil,hasMicDejunInclus,hasPapuciDeCamera,hasHalatPentruInterior);
    }
}
