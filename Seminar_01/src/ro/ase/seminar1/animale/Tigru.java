package ro.ase.seminar1.animale;

public class Tigru extends Animal {
    private String rasa;

    public Tigru(String nume, int age, String rasa) {
        super(nume, age);
        this.rasa = rasa;
    }

    @Override
    public void eat(String mancare) {
        System.out.println(" Tigrul "+ super.nume + " mananca "+mancare);
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tigrul{");
        sb.append("rasa='").append(rasa).append('\'');
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
