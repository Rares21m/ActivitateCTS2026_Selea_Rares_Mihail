package Strategy.clase;

public class Student {
    private String nume;
    private ModSustinere modSustinere;

    public Student(ModSustinere modSustinere) {
        this.modSustinere = modSustinere;

    }

    public Student(String nume){
        this.modSustinere=new Grila();
        this.nume=nume;
    }

    public void setModSustinere(ModSustinere modSustinere) {
        this.modSustinere = modSustinere;
    }

    public void examinare(){
        modSustinere.sustinereExamen();
    }
}
