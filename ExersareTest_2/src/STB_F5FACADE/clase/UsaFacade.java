package STB_F5FACADE.clase;

public class UsaFacade {
    UsaFata usaFata;
    UsaMijloc usaMijloc;
    UsaSpate usaSpate;

    public UsaFacade(UsaFata usaFata, UsaMijloc usaMijloc, UsaSpate usaSpate) {
        this.usaFata = usaFata;
        this.usaMijloc = usaMijloc;
        this.usaSpate = usaSpate;
    }

    public void elibereazaUsile(){
        usaFata.elibereaza();
        usaMijloc.elibereaza();
        usaSpate.elibereaza();
    }

    public void deschideFortat(){
        usaFata.deschideFortat();
        usaMijloc.deschideFortat();
        usaSpate.deschideFortat();
    }
}
