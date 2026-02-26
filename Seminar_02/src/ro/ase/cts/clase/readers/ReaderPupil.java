package ro.ase.cts.clase.readers;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;
import ro.ase.cts.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReaderPupil extends ReaderAplicanti {


    @Override
    public List<Aplicant> readAplicanti(String file) throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(file));
        input2.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<>();

        while (input2.hasNext()) {
            Elev p=new Elev();
            super.citesteAplicant(input2,p);
            int clasa = input2.nextInt();
            p.setClasa(clasa);
            String tutore = input2.next();
            p.setTutore(tutore);
            elevi.add(p);
        }

        input2.close();
        return elevi;
    }
}
