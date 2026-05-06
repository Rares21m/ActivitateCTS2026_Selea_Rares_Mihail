package Strategy.main;

import Strategy.clase.*;

public class Main {
    public static void main(String[] args) {
        Student student=new Student("Vasile");
        student.setModSustinere(new ProbaScrisa());
        student.examinare();

        student.setModSustinere(new ProbaOrala());
        student.examinare();

        student.setModSustinere(new Grila());
        student.examinare();

    }
}
