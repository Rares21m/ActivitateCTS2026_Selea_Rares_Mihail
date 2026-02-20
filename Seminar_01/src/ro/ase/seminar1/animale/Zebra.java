package ro.ase.seminar1.animale;

public class Zebra extends Animal {

    private int nrDungi;


    public Zebra(String nume, int age, int nrDungi) {
        super(nume, age);
        this.nrDungi = nrDungi;
    }

    @Override
    public void eat(String mancare) {
        System.out.println("Zebra a mancat"+mancare);

    }


    @Override
    public String toString(){
        StringBuilder buffer=new StringBuilder();
        buffer.append(" Zebra: ");
        buffer.append(super.toString());
        buffer.append(" numarul de dungi de pe zebra = ");
        buffer.append(this.nrDungi);
        return buffer.toString();

    }
}
