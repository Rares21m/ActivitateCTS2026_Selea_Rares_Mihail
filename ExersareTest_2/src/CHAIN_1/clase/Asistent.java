package CHAIN_1.clase;

public class Asistent extends SuportHandeler{
    @Override
    public String recomandareSuport(int dificultate) {
        if(dificultate<5){
            return "Asistent";
        }
        else {
            return super.succesor.recomandareSuport(dificultate);
        }
    }
}
