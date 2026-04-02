package PrototypeSTB;

public class Main {
    public static void main(String[] args) {
        MijlocTransportAbstract autobuz1=new Autobuz("Mercedes", 50, "Ion");
        System.out.println(autobuz1);
        MijlocTransportAbstract autobuz2=autobuz1.clone();
        ((Autobuz)autobuz2).setSofer("Gigel");
        System.out.println(autobuz2);

    }
}
