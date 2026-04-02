package Builder.main;

import Builder.Internare;
import Builder.InternareBuilder;
import Builder.InternareBuilderAlternativ;


public class Main {
    public static void main(String[] args) {
        Internare internare=new Internare(true,false,true,true,"Mairan Tigaie");
        Internare internare2=new Internare(false , false,false,false,"Ana Maria");

        InternareBuilder builder=new InternareBuilder("Ana Rock");
        Internare internare3=builder.build();
        Internare internare4=builder.setNume("Andrei Matei").setPat(true).setPapuci(true).setHalat(true).build();

        System.out.println(internare3);
        System.out.println(internare4);

        InternareBuilderAlternativ builderAlternativ=new InternareBuilderAlternativ();
        builderAlternativ.setMicDejun(true);
        Internare internare101=builderAlternativ.build("Georgescu Ion");

        Internare internare102=builderAlternativ.build("Georgescu Maria");
        Internare internare103=builderAlternativ.build("Selea Rares");

//        Pentru versiunea 2 nu avem nevoie de setteri in clasa Internare

//        internare101.setNumePacient("Popescu Ionel");
//        Daca eu vreau sa nu mai pot sa modific obiectul pentru elementul deja facut trebuie sa facem urmatoarele:
//




        System.out.println(internare101);
        System.out.println(internare102);
        System.out.println(internare103);
    }
}
