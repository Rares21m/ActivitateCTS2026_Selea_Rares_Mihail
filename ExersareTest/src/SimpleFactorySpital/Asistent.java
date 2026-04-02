package SimpleFactorySpital;

public class Asistent extends PersonalSpital{

    public Asistent(String nume, int vechimeAni) {
        super(nume, vechimeAni);
    }

    @Override
    public void AfiseazaDescrierePersonal() {
        StringBuilder sb=new StringBuilder();
        sb.append("Asistentul are numele ").append(this.nume)
                .append(" si are vechimea ").append(vechimeAni);
        System.out.println(sb.toString());
    }
}
