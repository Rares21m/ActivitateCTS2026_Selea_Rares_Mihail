package FLYWEIGHT_2.clase;

public class ModelCopac implements ICopac {
    private String numeCopac;
    private String texturaFrunza;

    public ModelCopac(String numeCopac, String texturaFrunza) {
        this.numeCopac = numeCopac;
        this.texturaFrunza = texturaFrunza;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ModelCopac{");
        sb.append("numeCopac='").append(numeCopac).append('\'');
        sb.append(", texturaFrunza='").append(texturaFrunza).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void planteaza(PozitieCopac pozitie) {
        System.out.println(this.toString()+" "+pozitie.toString());
    }
}
