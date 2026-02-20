package ro.ase.seminar1.animale;

public class Lion extends Animal {

    private int greutate;

    public Lion(String nume, int age, int greutate) {
        super(nume, age);
        this.greutate = greutate;
    }

    @Override
    public void eat(String mancare) {

        System.out.println("Leul a mancat"+mancare);
    }



    @Override
    public String toString(){
        StringBuilder buffer=new StringBuilder();
        buffer.append(" Leul: ");
        buffer.append(super.toString());
        buffer.append("  cu greutatea egala cu ");
        buffer.append(this.greutate);
        return buffer.toString();

    }

}
