package ChainOfResponsability.clase;

public class CalatorieTramvai extends CalatorieHandler{
    @Override
    public String recomandaCalatorie(double distanta) {
        if(distanta<10){
            return "Tramvai";
        }
        return super.calatorieHandler.recomandaCalatorie(distanta);
    }
}
