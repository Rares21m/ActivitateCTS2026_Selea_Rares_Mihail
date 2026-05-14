package RESTAURANT_B5.clase;

public class LucruBucatarie {
    private String idFactura;

    public LucruBucatarie(String idFactura) {
        this.idFactura = idFactura;
    }

    public String getIdFactura() {
        return idFactura;
    }

    public void printareFacturaBucatarie(){
        System.out.println("Factura cu id ul "+ this.idFactura+ " a fost printata cu succes");
    }
}
