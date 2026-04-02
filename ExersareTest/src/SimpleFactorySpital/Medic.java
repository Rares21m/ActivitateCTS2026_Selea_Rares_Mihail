package SimpleFactorySpital;

public class Medic extends PersonalSpital{
    public Medic(String nume, int vechimeAni) {
        super(nume, vechimeAni);
    }

    @Override
    public void AfiseazaDescrierePersonal() {
        StringBuilder sb=new StringBuilder();
        sb.append("Medicul are numele ").append(this.nume)
                .append(" si are vechimea ").append(vechimeAni);
        System.out.println(sb.toString());
    }
}
