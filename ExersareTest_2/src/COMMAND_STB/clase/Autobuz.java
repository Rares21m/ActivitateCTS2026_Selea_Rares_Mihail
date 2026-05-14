package COMMAND_STB.clase;

public class Autobuz {
    private String model;

    public Autobuz(String model) {
        this.model = model;
    }

    public void pleacaInTraseu(int nrLinie){
        System.out.println("Autobuzul "+model+" pleaca pe linia "+nrLinie);
    }
}
