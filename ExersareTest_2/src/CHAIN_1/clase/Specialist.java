package CHAIN_1.clase;

public class Specialist extends SuportHandeler{
    @Override
    public String recomandareSuport(int dificultate) {
        if(dificultate<15){
            return "Specialist";
        }
        else {
            return super.succesor.recomandareSuport(dificultate);
        }
    }
}
