package ase.cts.Facade.Clase;

public class Salon {
    private boolean paturiLibere[]=new boolean[50];


    private static Salon instantce=null;
    private Salon() {
       this.paturiLibere[1]=true;
       this.paturiLibere[2]=true;
       this.paturiLibere[4]=true;
       this.paturiLibere[6]=true;
       this.paturiLibere[8]=true;
       this.paturiLibere[13]=true;
    }


    public int existaPaturiLibere(){
        for(int i=0;i<=paturiLibere.length;i++){
            if(paturiLibere[i]==true){
                return i;
            }
        }
        return -1;
    }

    public void ocupaPat(int i){
        this.paturiLibere[i]=false;
    }

    public static Salon getInstance(){
        if(instantce==null){
            instantce=new Salon();
        }
        return instantce;
    }
}
