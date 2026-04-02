package PrototypeMancare;

public class Main {
    public static void main(String[] args) {
        ContractAbstract contract1=new Contract("Marian","Scris",23.45);
        ContractAbstract contract2=contract1.clone();

        ((Contract)contract2).setTipContract("Online");
        System.out.println(contract1);
        System.out.println(contract2);
    }
}
