package ExersareBuilder3;

public class Autobuz {
    private String model;
    private int nrLocuri;
    private String sofer;
    private boolean areAerConditionat;
    private boolean areWIFI;
    private String culoare;


    public Autobuz(String model, int nrLocuri, String sofer, boolean areAerConditionat, boolean areWIFI, String culoare) {
        super();
        this.model = model;
        this.nrLocuri = nrLocuri;
        this.sofer = sofer;
        this.areAerConditionat = areAerConditionat;
        this.areWIFI = areWIFI;
        this.culoare = culoare;
    }



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSofer() {
        return sofer;
    }

    public void setSofer(String sofer) {
        this.sofer = sofer;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    public void setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
    }

    public boolean isAreAerConditionat() {
        return areAerConditionat;
    }

    public void setAreAerConditionat(boolean areAerConditionat) {
        this.areAerConditionat = areAerConditionat;
    }

    public boolean isAreWIFI() {
        return areWIFI;
    }

    public void setAreWIFI(boolean areWIFI) {
        this.areWIFI = areWIFI;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("model='").append(model).append('\'');
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append(", sofer='").append(sofer).append('\'');
        sb.append(", areAerConditionat=").append(areAerConditionat);
        sb.append(", areWIFI=").append(areWIFI);
        sb.append(", culoare='").append(culoare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
