package ChainOfResponsability.main;

import ChainOfResponsability.clase.*;

public class Main {
    public static void main(String[] args) {
        CalatorieHandler calatorieAutobuz=new CalatorieAutobuz();
        CalatorieHandler calatorieTramvai=new CalatorieTramvai();
        CalatorieHandler calatorieTroleibuz=new CalatorieTroleibuz();
        CalatorieHandler calatorieMetrou=new CalatorieMetrou();

        calatorieTroleibuz.setCalatorieHandler(calatorieAutobuz);
        calatorieAutobuz.setCalatorieHandler(calatorieTramvai);
        calatorieTramvai.setCalatorieHandler(calatorieMetrou);
        //Deci aici putem inlocui daca nu merge efectiv ceva de exemplu daca nu merge tramvaiul sau metroul etc

        System.out.println(calatorieTroleibuz.recomandaCalatorie(5));
        System.out.println(calatorieTroleibuz.recomandaCalatorie(2));
        System.out.println(calatorieTroleibuz.recomandaCalatorie(7));

    }
}
