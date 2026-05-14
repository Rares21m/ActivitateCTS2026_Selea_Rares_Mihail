package FACADE_01.clase;

public class HomeCinemaFacade {
    Amplificator amplificator;
    DvdPlayer dvdPlayer;
    Lights lights;
    Proiector proiector;
    Screen screen;


    public HomeCinemaFacade() {
        this.amplificator = new Amplificator();
        this.dvdPlayer = new DvdPlayer();
        this.lights = new Lights();
        this.proiector = new Proiector(true,"Epson");
        this.screen = new Screen();
    }

    public void watchMovie(String movie){
        lights.dim(10);
        screen.coborare();
        proiector.preincalzire();
        proiector.setModWide();
        amplificator.porneste();
        amplificator.setVolum(20);
        dvdPlayer.play(movie);
    }
}
