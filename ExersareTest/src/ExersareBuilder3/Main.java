package ExersareBuilder3;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz=new AutobuzBuilder().setAreAerConditionat(true).setSofer("Marian").setNrLocuri(32).build();
        System.out.println(autobuz);

        Autobuz autobuz1=new AutobuzBuilder().setModel("Mercedes").setSofer("Maria").setNrLocuri(54).setAreWIFI(true).build();
        System.out.println(autobuz1);
    }
}
