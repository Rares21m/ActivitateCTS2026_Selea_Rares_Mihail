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


    public ReaderPupil(String numeFisier) {
        super(numeFisier);
    }

    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        Scanner input = new Scanner(new File(super.numeFisier));
        input.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<>();

        while (input.hasNext()) {
            Elev p = new Elev();
            super.citesteAplicant(input, p);
            int clasa = input.nextInt();
            p.setClasa(clasa);
            String tutore = input.next();
            p.setTutore(tutore);
            elevi.add(p);
        }

        input.close();
        return elevi;
    }
}
