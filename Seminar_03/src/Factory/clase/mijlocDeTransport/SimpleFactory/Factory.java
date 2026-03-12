package Factory.clase.mijlocDeTransport.SimpleFactory;

import Factory.clase.mijlocDeTransport.*;

public class Factory {

    public MijlocDeTransport getMijlocTransport(TipTransport tip,
                                                String marca,
                                                Integer nrLinie){
        switch (tip) {
            case TipTransport.AUTOBUZ->{
                Autobuz autobuz=new Autobuz(nrLinie,marca);
                return autobuz;
            }

            case TipTransport.TRAMVAI -> {
                return new Tramvai(nrLinie,marca);
            }

            case TipTransport.TROLEIBUZ -> {
                return new Troleibuz(nrLinie,marca);
            }
            default -> {
                return null;
            }
        }

    }


}
