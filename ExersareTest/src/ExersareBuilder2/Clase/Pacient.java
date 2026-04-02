package ExersareBuilder2.Clase;

public class Pacient {
    private boolean hasPatRabatabil;
    private boolean hasMicDejunInclus;
    private boolean hasPapuciDeCamera;
    private boolean hasHalatPentruInterior;

    public Pacient() {
        super();
        this.hasPatRabatabil = false;
        this.hasMicDejunInclus = false;
        this.hasPapuciDeCamera = false;
        this.hasHalatPentruInterior = false;
    }

    public Pacient(boolean hasPatRabatabil, boolean hasMicDejunInclus, boolean hasPapuciDeCamera, boolean hasHalatPentruInterior) {
        this.hasPatRabatabil = hasPatRabatabil;
        this.hasMicDejunInclus = hasMicDejunInclus;
        this.hasPapuciDeCamera = hasPapuciDeCamera;
        this.hasHalatPentruInterior = hasHalatPentruInterior;
    }


    public boolean isHasPatRabatabil() {
        return hasPatRabatabil;
    }

    public void setHasPatRabatabil(boolean hasPatRabatabil) {
        this.hasPatRabatabil = hasPatRabatabil;
    }

    public boolean isHasMicDejunInclus() {
        return hasMicDejunInclus;
    }

    public void setHasMicDejunInclus(boolean hasMicDejunInclus) {
        this.hasMicDejunInclus = hasMicDejunInclus;
    }

    public boolean isHasPapuciDeCamera() {
        return hasPapuciDeCamera;
    }

    public void setHasPapuciDeCamera(boolean hasPapuciDeCamera) {
        this.hasPapuciDeCamera = hasPapuciDeCamera;
    }

    public boolean isHasHalatPentruInterior() {
        return hasHalatPentruInterior;
    }

    public void setHasHalatPentruInterior(boolean hasHalatPentruInterior) {
        this.hasHalatPentruInterior = hasHalatPentruInterior;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("hasPatRabatabil=").append(hasPatRabatabil);
        sb.append(", hasMicDejunInclus=").append(hasMicDejunInclus);
        sb.append(", hasPapuciDeCamera=").append(hasPapuciDeCamera);
        sb.append(", hasHalatPentruInterior=").append(hasHalatPentruInterior);
        sb.append('}');
        return sb.toString();
    }
}
