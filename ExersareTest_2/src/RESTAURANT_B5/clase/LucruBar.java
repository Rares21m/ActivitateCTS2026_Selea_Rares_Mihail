package RESTAURANT_B5.clase;

public class LucruBar {
    private String idFactura;

    public LucruBar(String idFactura) {
        this.idFactura = idFactura;
    }

    public void printare(){
        System.out.println("Factura "+this.idFactura+" a fost printata cu succes");
    }
}
