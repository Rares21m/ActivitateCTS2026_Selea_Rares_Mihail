package STB_F11_OBSERVER.main;

import STB_F11_OBSERVER.clase.Calator;
import STB_F11_OBSERVER.clase.ICalator;
import STB_F11_OBSERVER.clase.IPlecareAutobuz;
import STB_F11_OBSERVER.clase.PlecareAutobuz;

public class Main {
    public static void main(String[] args) {
        ICalator calator=new Calator("Marius");
        ICalator calator2=new Calator("Marian");
        ICalator calator3=new Calator("Maria");

        IPlecareAutobuz organizare=new PlecareAutobuz("21");
        organizare.abonareClient(calator);
        organizare.abonareClient(calator2);
        organizare.abonareClient(calator3);

        organizare.trimiteMesajul("Autobuzul a plecat");
    }
}
