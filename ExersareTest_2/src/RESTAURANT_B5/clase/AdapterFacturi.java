package RESTAURANT_B5.clase;

public class AdapterFacturi extends LucruBar{

    LucruBucatarie facturaBucatarie;

    public AdapterFacturi(String idFactura, LucruBucatarie facturaBucatarie) {
        super(idFactura);
        this.facturaBucatarie = facturaBucatarie;
    }

    @Override
    public void printare() {
        facturaBucatarie.printareFacturaBucatarie();
    }
}
