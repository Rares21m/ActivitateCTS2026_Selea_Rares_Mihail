package PrototypeMancare;

public class Contract implements ContractAbstract{
    private String numeClient;
    private String tipContract;
    private double valoare;

    public Contract(String numeClient, String tipContract, double valoare) {
        this.numeClient = numeClient;
        this.tipContract = tipContract;
        this.valoare = valoare;
    }

    public Contract(){

    }

    public String getNumeClient() {
        return numeClient;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public String getTipContract() {
        return tipContract;
    }

    public void setTipContract(String tipContract) {
        this.tipContract = tipContract;
    }

    public double getValoare() {
        return valoare;
    }

    public void setValoare(double valoare) {
        this.valoare = valoare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Contract{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", tipContract='").append(tipContract).append('\'');
        sb.append(", valoare=").append(valoare);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public ContractAbstract clone() {
        Contract copie=new Contract();
        copie.numeClient=this.numeClient;
        copie.tipContract=this.tipContract;
        copie.valoare=this.valoare;
        return copie;
    }
}
