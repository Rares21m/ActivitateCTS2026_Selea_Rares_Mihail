package FACADE_01.clase;

public class Proiector {
    private String firma;
    private boolean setMode;

    public Proiector(boolean setMode, String firma) {
        this.setMode = setMode;
        this.firma = firma;
    }

    public void preincalzire(){
        System.out.println("Proiectorul trebuie sa ajunga la temperatura");
    }

    public boolean setModWide(){
        return setMode;
    }

}
