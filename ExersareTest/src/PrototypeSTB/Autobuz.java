package PrototypeSTB;

public class Autobuz implements MijlocTransportAbstract{
    private String model;
    private int nrLocuri;
    private String sofer;

    public Autobuz(String model, int nrLocuri, String sofer) {
        this.model = model;
        this.nrLocuri = nrLocuri;
        this.sofer = sofer;
    }

    public Autobuz() {}

    @Override
    public MijlocTransportAbstract clone() {
        Autobuz clona=new Autobuz();
        clona.model=this.model;
        clona.nrLocuri=this.nrLocuri;
        clona.sofer=this.sofer;
        return clona;
    }
    public void setSofer(String sofer) {
        this.sofer = sofer;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("model='").append(model).append('\'');
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append(", sofer='").append(sofer).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
