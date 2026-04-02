package ExersareBuilder3;

public class AutobuzBuilder implements IAutobuz{
    private String model;
    private int nrLocuri;
    private String sofer;
    private boolean areAerConditionat;
    private boolean areWIFI;
    private String culoare;


    public AutobuzBuilder() {
        this.areAerConditionat = false;
        this.areWIFI = false;
        this.culoare = "alb";
    }



    public AutobuzBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public AutobuzBuilder setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
        return this;
    }

    public AutobuzBuilder setSofer(String sofer) {
        this.sofer = sofer;
        return this;
    }

    public AutobuzBuilder setAreAerConditionat(boolean areAerConditionat) {
        this.areAerConditionat = areAerConditionat;
        return this;
    }

    public AutobuzBuilder setAreWIFI(boolean areWIFI) {
        this.areWIFI = areWIFI;
        return this;
    }

    public AutobuzBuilder setCuloare(String culoare) {
        this.culoare = culoare;
        return this;
    }

    @Override
    public Autobuz build() {
        return new Autobuz(model,nrLocuri,sofer,areAerConditionat,areWIFI,culoare);
    }
}
