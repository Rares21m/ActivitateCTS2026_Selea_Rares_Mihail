package SimpleFactorySpital;

public class Brancardier extends PersonalSpital{
    public Brancardier(String nume, int vechimeAni) {
        super(nume, vechimeAni);
    }

    @Override
    public void AfiseazaDescrierePersonal() {
        StringBuilder sb=new StringBuilder();
        sb.append("Brancardierul are numele ").append(this.nume)
                .append(" si are vechimea ").append(vechimeAni);
        System.out.println(sb.toString());
    }
}
