package Factory.clase.mijlocDeTransport.main;

import Factory.clase.mijlocDeTransport.Autobuz;
import Factory.clase.mijlocDeTransport.MijlocDeTransport;
import Factory.clase.mijlocDeTransport.SimpleFactory.Factory;
import Factory.clase.mijlocDeTransport.TipTransport;

public class Main {
    public static void main(String[]args){
        Factory fabricaTransport=new Factory();
        MijlocDeTransport autobuz=  fabricaTransport.getMijlocTransport(
                TipTransport.AUTOBUZ,"MAN",102
        );

        autobuz.afiseazaTipTransport();
        MijlocDeTransport tramvai=fabricaTransport.getMijlocTransport(
                TipTransport.TRAMVAI,"Imperio",41
        );
        tramvai.afiseazaTipTransport();
    }
}
