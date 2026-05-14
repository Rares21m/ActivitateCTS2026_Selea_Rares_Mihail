package COMMAND_1.clase;

public class ContBancar {
    private String detaliiCont;

    public ContBancar(String detaliiCont) {
        this.detaliiCont = detaliiCont;
    }

    public void depunere(double suma){
        System.out.println("A fost depusa in cont suma : "+suma);
    }

    public void retragere(double suma){
        System.out.println("A fost retrasa din cont suma: "+suma);
    }

}
