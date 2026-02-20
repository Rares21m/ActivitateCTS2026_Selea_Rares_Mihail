package ro.ase.seminar1.animale;

public abstract class Animal {
    protected String nume;
    protected int age;
    public abstract void eat(String mancare);

    public Animal(String nume, int age) {
        this.nume = nume;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nume='" + nume + '\'' +
                ", age=" + age +
                '}';
    }
}
