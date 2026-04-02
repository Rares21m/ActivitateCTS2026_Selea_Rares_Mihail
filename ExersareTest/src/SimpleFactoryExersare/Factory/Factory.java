package SimpleFactoryExersare.Factory;

import Factory.clase.mijlocDeTransport.Autobuz;
import Factory.clase.mijlocDeTransport.MijlocDeTransport;
import Factory.clase.mijlocDeTransport.TipTransport;
import Factory.clase.mijlocDeTransport.Tramvai;
import Factory.clase.mijlocDeTransport.Troleibuz;

public class Factory {
    public MijlocDeTransport getMijlocDeTransport(TipTransport tip,Integer nrLinie,String marca){

        switch (tip) {
            case AUTOBUZ->{
                return new Autobuz(nrLinie,marca);
            }

            case TRAMVAI -> {
                return new Tramvai(nrLinie,marca);
            }

            case TROLEIBUZ -> {
                return new Troleibuz(nrLinie,marca);
            }
            default -> {
                return null;
            }
        }




    }



}
