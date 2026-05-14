package RESTAURANT_B5.main;

import RESTAURANT_B5.clase.AdapterFacturi;
import RESTAURANT_B5.clase.LucruBar;
import RESTAURANT_B5.clase.LucruBucatarie;

public class Main {
    public static void main(String[] args) {
        LucruBucatarie facturaBucatarie=new LucruBucatarie("OT232");

        LucruBar facturaBar=new AdapterFacturi(facturaBucatarie.getIdFactura(),facturaBucatarie);

        facturaBar.printare();
    }
}
