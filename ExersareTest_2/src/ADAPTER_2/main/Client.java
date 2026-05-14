package ADAPTER_2.main;

import ADAPTER_2.clase.AdaptorProdusFraged;
import ADAPTER_2.clase.PachetStandard;
import ADAPTER_2.clase.ProdusFraged;

public class Client {
    public static void main(String[] args) {
        PachetStandard pachet=new PachetStandard();
        ProdusFraged produs=new AdaptorProdusFraged(pachet);

        produs.livrareSpecialaCuAtentie();
    }
}
